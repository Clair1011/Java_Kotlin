package com.Clair

fun main() {
//    println("Hello")

//    Human().hello()

    val h = Human()
    h.hello()
}

//class函數不能跟Java同名
class Human {
    fun hello(){
        println("Hello Kotlin")
    }
}