package com.diego.kotlincourse.functions

fun hello(): Unit {
    println("Hello")
}

fun throwingException(){
    throw Exception("This function throws an exception")
}

fun main(args: Array<String>){
    hello()
}