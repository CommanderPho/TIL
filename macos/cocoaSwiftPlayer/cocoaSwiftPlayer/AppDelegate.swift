//
//  AppDelegate.swift
//  cocoaSwiftPlayer
//
//  Created by rhino Q on 05/09/2018.
//  Copyright © 2018 rhino Q. All rights reserved.
//

import Cocoa

@NSApplicationMain
class AppDelegate: NSObject, NSApplicationDelegate {
    let popover = NSPopover()
    let statusItem = NSStatusBar.system.statusItem(withLength: NSStatusItem.variableLength)
    var eventMonitor:EventMonitor?
    
    var mainWC:MainWindoeController?

    func applicationDidFinishLaunching(_ aNotification: Notification) {
        
        print("applicationDidFinishLaunching")
        
        PlayerManager.sharedManager.statusItem = statusItem
        
        if let button = statusItem.button {
            button.imagePosition = .imageLeft
            button.image = #imageLiteral(resourceName: "icon")
            button.action = #selector(togglePopover(sender:))
        }
        popover.contentViewController = StatusItemViewController.loadFromNib()
        eventMonitor = EventMonitor(mask: [.leftMouseUp, .rightMouseUp], handler: { (event) in
            if self.popover.isShown {
                self.closePopover(sender: event)
            }
        })
        
//        let mainStoryBoard = NSStoryboard(name: NSStoryboard.Name(rawValue: "Main"), bundle: nil)
//        mainWC = mainStoryBoard.instantiateController(withIdentifier: NSStoryboard.SceneIdentifier(rawValue: "MainWindoController")) as? MainWindoeController
//
//        mainWC?.showWindow(self)
    }

    func applicationWillTerminate(_ aNotification: Notification) {
        // Insert code here to tear down your application
    }
    
    // MARK: - Helpers
    
    func showPopover(sender:Any?) {
        if let button = statusItem.button {
            popover.show(relativeTo: button.bounds, of: button, preferredEdge: .minY)
        }
        eventMonitor?.start()
    }
    
    func closePopover(sender: Any?) {
        popover.performClose(sender)
        eventMonitor?.stop()
    }
    
    @objc func togglePopover(sender: Any?) {
        if popover.isShown {
            closePopover(sender: sender)
        } else {
            showPopover(sender: sender)
        }
    }
}

