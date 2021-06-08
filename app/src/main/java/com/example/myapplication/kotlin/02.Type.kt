package com.example.myapplication.kotlin

// 02. 자료형
// 정수형 -> Long > Int > Short > Byte
// 실수형 -> Double > Float
// 문자 -> Char
// 문자열 -> String
// 논리형(True/False) -> Boolean

var number = 10

// 변수 선언 방법 2
// var/val 변수 : 자료형 = 값
var number1 : Int = 20
var hello1 : String = "Hello"
var point1 : Double = 3.4

// var (variable) 와 val (value) 의 선택 기준
// 1. 불변 val
// 2. 불변일지 알 수 없음 var


fun main(array: Array<String>) {
    number = 20
    //한번 선언을 하면 해당 변수에는 같은 자료형만 지정 가능함
    //선언할떄 타입을 명시하지는 않지만 java와 비슷하다고 보면 됨
    //number = "s"

}