package com.diego.kotlincourse.stdlib

fun main(args: Array<String>) {
    val elements = 1..100
    // it checks every single entry whether its lower than 30 or not, thus the more entries, the longer it takes
    // val output = elements.filter { it < 30 }.map { Pair("Yes",it) }
    // when wrapping a collection as a sequence, lazy evaluation is performed
    val output = elements.asSequence().filter { it < 30 }.map { Pair("Yes",it) }
    output.forEach { println(it) }

    val output2 = elements.asSequence().take(30).sum()
    println(output2)

    val numbers = generateSequence(1) { it + 10 }
    println(numbers.take(30).sum())

    val lazyInit: Int by lazy { 10 } // 'by lazy' initializes a variable with lazy evaluation

}