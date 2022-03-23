package com.diego.kotlincourse.basics

fun main(args: Array<String>){
    var myString = "not empty"

    val result =
        if (myString != "") "not empty"
        else "empty"
    println(result)
}