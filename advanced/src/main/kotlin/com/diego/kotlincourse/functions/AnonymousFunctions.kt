package com.diego.kotlincourse.functions


fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {
    op(3) { it * it }
    op(2, fun(x): Int { return x * x } ) // anonymous function
}