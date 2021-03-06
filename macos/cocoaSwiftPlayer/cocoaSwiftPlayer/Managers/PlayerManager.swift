//
//  PlayerManager.swift
//  cocoaSwiftPlayer
//
//  Created by rhino Q on 05/09/2018.
//  Copyright © 2018 rhino Q. All rights reserved.
//  한곡반복
// numberOfLoops = -1
// player?.play(atTime: <#T##TimeInterval#>) 이용 구간 반복

import Cocoa
import AVFoundation
import RealmSwift

class PlayerManager: NSObject, AVAudioPlayerDelegate {
    static var sharedManager = PlayerManager()
    
    var statusItem: NSStatusItem?
    
    var isPlaying:Bool {
        if let player = player {
            return player.isPlaying
        } else {
            return false
        }
    }
    var player: AVAudioPlayer?
    var currentIndex: Int?
    
    // TODO: 유효하지 않은 url처리...
    var currentSong: Song? = nil {
        didSet {
            if let currentSong = currentSong {
                currentIndex = currentPlayList.index(of: currentSong)
                
                if currentSong.location != player?.url?.path {
                    player = try? AVAudioPlayer(contentsOf: URL(fileURLWithPath: currentSong.location))
                    player?.volume = volume
                }
                
                songTimer = nil
                songProgress = 0
                
                NotificationCenter.default.post(name: Notification.Name.ChangeSong, object: self, userInfo: [NotificationUserInfos.Song:currentSong])
            } else {
                stop()
                player = nil
            }
        }
    }
    
    // currently using list
    var currentPlayList: [Song] = []
    
    // made of default originalPlayList
    var shufflePlayList: [Song] = []
    var originalPlayList:[Song] = [] {
        didSet {
            if !isShuffle {
                currentPlayList = originalPlayList
            }
        }
    }
    
    var isRepeated = false {
        didSet {
            print("isRepeated : \(isRepeated)")
        }
    }
    var isShuffle = false {
        didSet {
            print("isShuffle: \(isShuffle)")
            if isShuffle {
                if let currentSong = currentSong {
                    let list = originalPlayList.filter {
                        return $0.location != currentSong.location
                    }
                    shufflePlayList = [currentSong] + list.shuffle()
                } else {
                    shufflePlayList = originalPlayList.shuffle()
                }
                currentPlayList = shufflePlayList
            } else {
                currentPlayList = originalPlayList
            }
        }
    }
    var volume:Float = 0.5 {
        didSet {
            player?.volume = volume
            NotificationCenter.default.post(name: NSNotification.Name.VolumeChanged, object: self, userInfo: nil)
        }
    }
    
    var songTimer: Timer? {
        didSet {
            oldValue?.invalidate()
//            songProgress = 0
        }
    }
    
    var songProgress: Double = 0
    var songProgressText: String  {
        return "\(timeFormaater.string(from: songProgress)!)"
    }
    
    lazy var timeFormaater: DateComponentsFormatter = {
        let formatter = DateComponentsFormatter()
        formatter.allowedUnits = [.minute, .second]
        formatter.zeroFormattingBehavior = .pad
        return formatter
    }()
    
    // MARK: Player Control
    
    func play() {
        if isPlaying {
            pause()
            return
        }
        
        if currentPlayList.isEmpty {
            loadAllSongs()
        }
        
        if currentSong == nil {
            // play the frist song of the whole list if nil
            currentSong = currentPlayList[0]
        }
        
        player?.play()
        
        songTimer = Timer.scheduledTimer(timeInterval: 1.0, target: self, selector: #selector(updateProgress), userInfo: nil, repeats: true)
        
        
        NotificationCenter.default.post(name: Notification.Name.StartPlaying, object: self, userInfo: [NotificationUserInfos.Song:currentSong!])
    }
    
    func pause() {
        player?.pause()
        
        songTimer = nil
        
        NotificationCenter.default.post(name: Notification.Name.PausePlaying, object: self, userInfo: [NotificationUserInfos.Song: currentSong!])
    }
    
    func stop() {
        player?.stop()
    }
    
    func next() {
        //TODO: 마지막이면 첫번째걸로
        guard let currentIndex = currentIndex else { return }
        
        if !isRepeated && currentIndex == currentPlayList.count - 1 {
            currentSong = nil
        } else if isRepeated && currentIndex == currentPlayList.count - 1 {
            currentSong = currentPlayList.first
            play()
        } else {
            currentSong = currentPlayList[currentIndex + 1]
            play()
        }
    }
    
    func rewind() {
        //TODO: 첫 번째면 마지막 걸로
        guard let currentIndex = currentIndex else { return }
        
        if !isRepeated && currentIndex == 0 {
            currentSong = nil
        } else if isRepeated && currentIndex == 0 {
            currentSong = currentPlayList.last
            play()
        } else {
            currentSong = currentPlayList[currentIndex - 1]
            play()
        }
    }
    
    private func loadAllSongs() {
        let realm = try! Realm()
        currentPlayList = realm.objects(Song.self).map { $0 }
    }
    
    // MARK: - Timer
    
    @objc func updateProgress() {
        songProgress += 1
        statusItem?.button?.title = songProgressText
    }
}
