package com.diego.kotlincourse.tidbits

import java.io.BufferedReader
import java.io.FileReader

class NotANumberException(message: String): Throwable(message) {
    // to use a custom message, String parameter has to be passed to Throwable constructor
}

fun checkIsNumber(obj: Any){
    when(obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("NaN")
    }
}

fun main(args: Array<String>) {
    //throw NotANumberException()
    try {
        checkIsNumber("A")
    } catch (e: java.lang.IllegalArgumentException){
        println("do nothing")
    } catch (e: NotANumberException){
        println("${e.message}")
    }

    val buffer = BufferedReader(FileReader("input.txt"))
    val result = try {
        val chars = CharArray(30)
        buffer.read(chars,0,40)
    } catch (e: IndexOutOfBoundsException) {
        println("Exception handled")
        -1
    } finally {
        println("Closing buffer")
        buffer.close()
    }
    println(result)

}