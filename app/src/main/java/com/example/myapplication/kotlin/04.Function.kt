package com.example.myapplication.kotlin

//함수 선언법
// fun 함수명 (변수명: 타입, 변수명: 타입 ....) : 리턴타입 {
//      함수 내용
//      return 리턴타입
//  }

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

//default 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

//반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

//간단하게 함수를 선언하기
fun plusShort(first: Int, second: Int) = first + second

//가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main(array: Array<String>) {
    println(plus(3, 4))
    println(plus(first = 10, second = 20))

    println(plusFive(10, 20))
    println(plusFive(10))

    printPlus(10, 20)

    plusMany(1,2,3,4,5)
}

