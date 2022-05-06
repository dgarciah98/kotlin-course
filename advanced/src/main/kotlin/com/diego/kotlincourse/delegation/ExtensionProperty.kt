package com.diego.kotlincourse.delegation

val String.hasAmpersand: Boolean
    get() = this.contains("&")

fun main(args: Array<String>) {
    println("Hello".hasAmpersand)
    println("Hello & Bye".hasAmpersand)
}