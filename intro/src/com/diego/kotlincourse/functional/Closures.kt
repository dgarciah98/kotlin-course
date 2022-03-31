package com.diego.kotlincourse.functional

fun outsideFunction(){

    for (number in 1..30) {      // closure closes the variable each time the lambda finishes
        unaryOperation(20) { x ->    // but it uses a new one each time due to the for loop
            println(number)
            x * number
        }
    }
}

fun main(args: Array<String>) {
    outsideFunction()
}