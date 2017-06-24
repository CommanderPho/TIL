//: Playground - noun: a place where people can play

import UIKit
import PlaygroundSupport

var str = "Hello, playground"
print("\(str)")

let frame = CGRect(x: 0, y: 0, width: 150, height: 150)

let customView = UIView(frame: frame)
customView.backgroundColor = UIColor.blue

//XCPlaygroundPage.currentPage.liveView = customView
PlaygroundPage.current.liveView = customView

// : var(변수)와 let(상수)
let maxSpeed = 200
//let maxSpeed:Int = 200
// maxSpeed += 10

var currentSpeed =  110
currentSpeed += 10
Int(20.5)
currentSpeed += Int(20.5)
//currentSpeed += 20.5

let intMax = Int.max
let UintMax = UInt.max
let intMin = Int.min
let UintMin = UInt.min

let pi = 3.14
let divider = 2
let halfPi = 3.14/Double(divider)

// : String과 Numbers
let name:String = "Seongkwan"
var greeting = "Hello"
greeting += " " + name

// 문자열의 문자를 하나하나
let charecters = name.characters
let count = charecters.count

let url = "www.codershigh.com"
let hasProtocol = url.hasPrefix("http://")

// 문자열 결합이나 문자열 안에 숫자를 넣을 경우 \() 사용
print("\(name)")

// : Tuple : (,) , 모든 타입이 가능함
var time1 = (9,0,48)
time1.0
let time2 : (h:Int, m:Int, s:Int) = (11, 51, 5)
time2.h
time2.m
time2.s

// 튜플은 참조가 아닌 복사
var time3 = time1
time1.0 = 8
time1 // 8 0 48
time3 // 9 0 48

// tuple in tuple
let duration = (time1, time2)

let (start, end) = duration
let endHour = end.h

// typealias
typealias Time = (h:Int, m:Int, s:Int)
typealias Duration = (start:Time, end:Time)

let today:Duration = ((9,10,23),(17,8,21))
print("We studied until \(today.end.h) today")

//Array, 하나의 타입만 가능
var meetingRooms:Array<String> = ["Bansky", "Rivera", "Kahlo", "Picasso", "Cezanne", "Matisse"]
// 축약
var groups:[Int] = [10, 8, 14, 9]

meetingRooms += ["Renoir"]

//추가1
var speedHistory:[Int] = []
speedHistory += [currentSpeed]

//추가2
let gpsSpeed0901 = 114.1
speedHistory.append(Int(gpsSpeed0901))

// 값에 접근
speedHistory[0]
speedHistory.first

// Array는 참조가 아닌 복사된다.
let historyBackup = speedHistory
// 하나가 변하는 순간이 복사되는 순간
speedHistory += [150]

historyBackup

// Dictionary  값에 이름표를 붙여 저정하는 상자





