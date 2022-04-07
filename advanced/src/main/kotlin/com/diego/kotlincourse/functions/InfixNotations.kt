package com.diego.kotlincourse.functions

infix fun String.shouldBeEqualTo(value: String) = this == value

fun main(args: Array<String>) {
    "Hello".shouldBeEqualTo("Hello")
    "Hello" shouldBeEqualTo "Hello" // infix notation

    val output = "Hello"
    output shouldBeEqualTo "Hello"
}