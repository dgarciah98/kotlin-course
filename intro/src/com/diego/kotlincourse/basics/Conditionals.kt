package com.diego.kotlincourse.basics

fun main(args: Array<String>){
    var myString = "not empty"

    var result =
        if (myString != "") "A string"
        else "Another String"
    println(result)

    result = "Value"
    val whenValue = when(result){
        "Value" -> {
            println("It's a value")
            println("Second line")
            "Returning from first when case"
        }
        is String -> {
            println("Excellent")
            "Remove that"
        }
        else -> {
            println("else")
            "This warning is now gone" // type mismatch warning
        }
    }
    println(whenValue)
}