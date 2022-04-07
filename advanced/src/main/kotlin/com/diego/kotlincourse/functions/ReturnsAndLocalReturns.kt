package com.diego.kotlincourse.functions

fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun containingFunction() {
    val numbers = 1..100
    numbers.myForEach myLabel@{
        if(it % 5 == 0) {
            // return       // returns from containingFunction(), not getting to print "Hello"
            return@myLabel  // returns at label
        }
    }
    println("Hello")
}

fun main(args: Array<String>) {
    containingFunction()
}