import Foundation

enum lenghtUnit:Int{
    case cm
    case m
    
    var ratio:Double{
        get{
            switch self {
            case .cm: return 1.0
            case .m: return 0.01
            }
        }
    }
    
    var symbol:String{
        get{
            switch self {
            case .cm: return "cm"
            case .m: return "m"
            }
        }
    }
}

var units:Dictionary<String,lenghtUnit> = [
    "cm" : lenghtUnit.cm,
    "m" : lenghtUnit.m
]

struct length{
    var lenghtCm = 0.0 // 기본 단위
    
    init(_ lenght:Double, lenghtUnit:lenghtUnit){
        lenghtCm = lenght / lenghtUnit.ratio
    }
    
    func valueOfLenghtUnit(lenghtUnit:lenghtUnit) -> String{
        return "\(lenghtCm * lenghtUnit.ratio)\(lenghtUnit.symbol)"
    }
}

func getInputValue() -> String?{
    print("변환할 값과 단위를 입력해주세요 ex)180cm")
    return "180cm"
//    return readLine()
}

func startConvert(){
    guard let inputValue = getInputValue() else {
        print("유효하지 않은 값입니다")
        return
    }
    let (lenghtWithoutUnit,unit) = splitIntoLenghtAndUnit(inputValue: inputValue)
    
    guard let resultUnit = units[unit] else {
        print("지원하지 않는 단위입니다.")
        return
    }
    
    let result = length(lenghtWithoutUnit, lenghtUnit: resultUnit)
    
    // 180cm -> 1.8m로 바꾸기
    result.valueOfLenghtUnit(lenghtUnit:.m)
}

// TODO : 정규식으로 간단히 할 수 없는지 알아보기
func splitIntoLenghtAndUnit(inputValue:String) -> (lenghtWithoutUnit:Double, unit:String){
    // 숫자 셋 지정
    let digitsAndDot:[Character] = ["0","1","2","3","4","5","6","7","8","9","."]
    //문자열의 첫번 째 인 덱스
    var tempIndex = inputValue.startIndex
    // 숫자와 닷이 아닐 때까지 돈다
    while digitsAndDot.contains(inputValue[tempIndex]) == true {
        tempIndex = inputValue.index(after: tempIndex)
    }
    // 이미 위에서 확인 했으므로 !
    let lenghtWithoutUnit = Double(inputValue[..<tempIndex].description)!
    let unit:String = inputValue[tempIndex...].description
    
    return (lenghtWithoutUnit,unit)
}

startConvert()


//func matches(for regex: String, in text: String) -> [String] {
//
//    do {
//        let regex = try NSRegularExpression(pattern: regex)
//        let results = regex.matches(in: text,range: NSRange(text.startIndex..., in: text))
//        return results.flatMap {
//            Range($0.range, in: text).map { String(text[$0]) }
//        }
//    } catch let error {
//        print("invalid regex: \(error.localizedDescription)")
//        return []
//    }
//}
//let string = "190cm"
//string.range(of: "190")
//let matched = matches(for: "[0-9]", in: string)
//print(matched)


//var abcString:String = "1.8m"
//abcString.startIndex
//abcString.endIndex
//abcString.hasSuffix("cm")


// var c = MyFancyCollection([10, 20, 30, 40, 50])
// var i = c.startIndex
// while i != c.endIndex {
// c[i] /= 5
// i = c.index(after: i)
// }
//  c == MyFancyCollection([2, 4, 6, 8, 10])
/*
 let letters = CharacterSet.letters
 let digits = CharacterSet.decimalDigits
 
 var letterCount = 0
 var digitCount = 0
 
 for uni in phrase.unicodeScalars {
 if letters.contains(uni) {
 letterCount += 1
 } else if digits.contains(uni) {
 digitCount += 1
 }
 }
 let index: Int = string.startIndex.distanceTo(range.startIndex)
 

 */

// 180cm와 같이 숫자와 단위가 묶어진 string을 숫자와 단위로 나누기
// 정규식으로 간단히 할 수 없는지 알아보기
//func splitIntoNumberAndString(inputValue:String) -> (valueWithoutUnit:Int, unit:String){
//    //숫자 셋 지정
//    let digits = CharacterSet.decimalDigits
//    // 문자열의 첫 번째 index
//    var i = inputValue.startIndex
//
//    // 문자열의 문자 하나하나를 체크해서 숫자가 아닐 때까지 반복
//    while digits.contains(inputValue.unicodeScalars[i]) == true{
//        i = inputValue.index(after: i)
//    }
//
//    // 이미 위해섯 숫자인지 확인 했으므로 !
//    let valueWithoutUnit:Int = Int(inputValue[..<i].description)!
//    let unit:String = inputValue[i...].description
//    return (valueWithoutUnit,unit)
//}
//splitIntoNumberAndString(inputValue: "1.8inch")

