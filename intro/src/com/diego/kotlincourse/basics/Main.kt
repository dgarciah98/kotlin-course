package com.diego.kotlincourse.basics

import com.diego.kotlincourse.functional.toTitleCase
import com.diego.kotlincourse.basics.utils.someUtility as someAdditionalFunction

fun main(args: Array<String>){
    println("Hello World!".toTitleCase("import"))
    someAdditionalFunction("Some name")
}