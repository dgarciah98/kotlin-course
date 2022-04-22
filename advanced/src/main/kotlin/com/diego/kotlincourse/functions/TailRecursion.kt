package com.diego.kotlincourse.functions

fun factorial(number: Int): Int {
    return when(number){
        0, 1 -> 1
        else -> number * factorial(number-1)
    }
}

fun factorialTR(number: Int, accumulator: Int = 1): Int {
    return when(number){
        0 -> accumulator
        else -> factorialTR(number-1, accumulator*number)
    }
}

fun main(args: Array<String>) {
    println(factorial(5))
    println(factorialTR(5))
}