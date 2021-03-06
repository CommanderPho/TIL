//
//  PlayListVIewController.swift
//  cocoaSwiftPlayer
//
//  Created by rhino Q on 06/09/2018.
//  Copyright © 2018 rhino Q. All rights reserved.

// TODO: multi song drop enable

import Cocoa
import RealmSwift

class PlayListVIewController: NSViewController {
    @IBOutlet weak var outlineView: NSOutlineView!
    var playlists = [Playlist]() {
        didSet {
            outlineView.reloadData()
            outlineView.expandItem(nil, expandChildren: true)
        }
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        outlineView.dataSource = self
        outlineView.delegate = self
        
        let menu = NSMenu()
        menu.addItem(NSMenuItem(title: "Delete", action: #selector(deletePlayList(sender:)), keyEquivalent: ""))
        outlineView.menu = menu
        
        print("PlayListVIewController viewdidLoad")
        RealmMigrationManager.migrate()
        
        let realm = try! Realm()
        playlists = realm.objects(Playlist.self).map { $0 }
        
        outlineView.registerForDraggedTypes([NSPasteboard.PasteboardType.string])
    }
    
    @objc func deletePlayList(sender:Any) {
        // TODO:      outlineView.selectedRowIndexes 이용해서 playlist도 song처럼 멑티 삭제..
       let playlist = playlists[outlineView.clickedRow - 1]
       playlists.remove(at: outlineView.clickedRow - 1 )
       outlineView.reloadData()
       playlist.delete()
    }
    
    //MARK: - Helper
    private func isHeader(item:Any) -> Bool {
        return item is String
    }
    
    @IBAction func addPlayList(_ sender: NSButton) {
        let playlist = Playlist()
        let realm = try! Realm()
        try! realm.write {
            realm.add(playlist)
        }
        playlists.append(playlist)
    }
    
}

extension PlayListVIewController: NSOutlineViewDataSource {
    func outlineView(_ outlineView: NSOutlineView, numberOfChildrenOfItem item: Any?) -> Int {
        if item == nil {
            return 1
        } else {
            return playlists.count
        }
    }
    
    func outlineView(_ outlineView: NSOutlineView, isItemExpandable item: Any) -> Bool {
        return isHeader(item: item)
    }
    
    func outlineView(_ outlineView: NSOutlineView, child index: Int, ofItem item: Any?) -> Any {
        if item == nil { // root
            return "Library"
        } else {
            return playlists[index]
        }
    }
    
    func outlineView(_ outlineView: NSOutlineView, objectValueFor tableColumn: NSTableColumn?, byItem item: Any?) -> Any? {
        return item
    }
    
    func outlineView(_ outlineView: NSOutlineView, validateDrop info: NSDraggingInfo, proposedItem item: Any?, proposedChildIndex index: Int) -> NSDragOperation {
        
        let canDrag = item is Playlist && index < 0
        return canDrag ? .move : []
    }
    
    func outlineView(_ outlineView: NSOutlineView, acceptDrop info: NSDraggingInfo, item: Any?, childIndex index: Int) -> Bool {
        guard let playlist = item as? Playlist else { return false }
        let pb = info.draggingPasteboard()
        let location = pb.string(forType: .string)
        
        let realm = try! Realm()
        if let location = location {
            if let song = realm.objects(Song.self).filter("location = '\(location)'").first {
                let index = playlist.songs.index { s in
                    return s.location == song.location
                }
                if index == nil {
                    try! realm.write {
                        playlist.songs.append(song)
                    }
                    outlineView.reloadData()
                }
            }
            return true
        }
        return false
    }
}

extension PlayListVIewController: NSOutlineViewDelegate {
    func outlineView(_ outlineView: NSOutlineView, viewFor tableColumn: NSTableColumn?, item: Any) -> NSView? {
        if isHeader(item: item) {
            return outlineView.makeView(withIdentifier: NSUserInterfaceItemIdentifier(rawValue: "HeaderCell"), owner: self)
        } else {
            let view =  outlineView.makeView(withIdentifier: NSUserInterfaceItemIdentifier(rawValue: "DataCell"), owner: self) as? CustomTableCellView
            
            if let playlist = item as? Playlist {
                view?.textField?.stringValue = "\(playlist.name)"
                view?.textField?.delegate = self
                view?.songCount.stringValue = "\(playlist.songs.count)"
            }
            return view
        }
    }
    
    func outlineView(_ outlineView: NSOutlineView, shouldSelectItem item: Any) -> Bool {
        return !isHeader(item: item)
    }
    
    func outlineView(_ outlineView: NSOutlineView, shouldShowOutlineCellForItem item: Any) -> Bool {
        return isHeader(item:item)
    }
    
    func outlineViewSelectionDidChange(_ notification: Notification) {
        let playlist = playlists[outlineView.selectedRow - 1 ]
        NotificationCenter.default.post(name: Notification.Name.SwitchPlayList, object: self, userInfo: [NotificationUserInfos.PlayList:playlist])
    }
}

extension PlayListVIewController: NSTextFieldDelegate {
    override func controlTextDidEndEditing(_ obj: Notification) {
        if let textField = obj.object as? NSTextField {
            let row = outlineView.row(for: textField)
            let playlist = playlists[row-1]
            
            let realm = try! Realm()
            try! realm.write {
                playlist.name = textField.stringValue
            }
        }
    }
}
