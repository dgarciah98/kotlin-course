package com.diego.kotlincourse.functions

fun foo(fooParam: String) {
    val outerFunction = "Value"
    fun bar(barParam: String){
        println(barParam)
        println(fooParam)
        println(outerFunction)
    }
}

fun main(args: Array<String>) {
    foo("Some value")
    //bar("Some value")
    //cant access bar()
}