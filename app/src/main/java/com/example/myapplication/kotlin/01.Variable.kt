package com.example.myapplication.kotlin


//변수 선언하는 방법
// var 변수명 = 값 (variable : 변수로 자유롭게 사용 가능)
// val 변수명 = 값 (Value : 한번 선언하면 불변)

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(args:Array<String>) {

    println(num)
    println(hello)
    println(point)
    println(fix)
    println("==================")

    num = 100

    println(num)

    //fix = 200
}