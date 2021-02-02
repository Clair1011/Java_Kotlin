package com.Clair

fun main() {
//println("Hello")

// Human().hello()

    val h = Human()
    h.hello()
    //kotlin 沒有基本資料型態, 只有物件所表示的資料型態
    //var 變數 //val 定義後不能改變的值
    val age : Int = 19
    //val age = 19 // kotlin可變數型態自動推斷  ((python..
    // age = 19  // 以val宣告 不可變動值
    var weight = 66.5
    weight = 55.0 //以var宣告可更動值
    var name : String
    name = "Clair"
}

//class函數不能跟Java同名
class Human {
    fun hello(){
        println("Hello Kotlin")

    }
}