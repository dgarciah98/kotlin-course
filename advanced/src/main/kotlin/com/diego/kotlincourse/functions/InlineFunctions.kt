package com.diego.kotlincourse.functions


inline fun nonOp(x: Int){
    // compiler advice: inlining works best for lambdas
}

inline fun operation(/* noinline */ op: () -> Unit /*, op2: (Int) -> Int*/) {
    println("Before calling op")
    op()
    throw Exception("A message")
    println("After calling op")
}

fun tryingToInline(op: () -> Unit) {
    val reference = op // illegal inlining
    println("Assigned value")
    op()
}

fun anotherFunction() {
    operation { println("This is the actual op function") }
    // operation() code will be also copied here
}

fun main(args: Array<String>) {
    operation { println("This is the actual op function") }
    // 'inline' takes a high order function, copying and pasting its code
    // to the section where the function is being called
}