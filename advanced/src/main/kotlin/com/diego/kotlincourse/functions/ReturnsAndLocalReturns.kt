package com.diego.kotlincourse.functions

inline fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun containingFunction() {
    val numbers = 1..100
    /*numbers.myForEach /*myLabel@*/{

        if(it % 5 == 0) {
            // return       // returns from containingFunction(), not getting to print "Hello"
            // return@myLabel  // returns at label
            // return@myForEach  // returns at myForEach function
            return // return not allowed since function is not inlined
        }
    }
    println("Hello")*/

    numbers.forEach(fun(element) {
        if(element % 5 == 0)
            return // returns to local function which is fun()
    })
    println("Hello")
}

fun main(args: Array<String>) {
    containingFunction()
}