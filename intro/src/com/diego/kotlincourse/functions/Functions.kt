package com.diego.kotlincourse.functions

fun hello(): Unit {
    println("Hello")
}

fun throwingException(){
    throw Exception("This function throws an exception")
}

fun returnsAFour(): Int {
    return 4
}

fun takingString(name: String){
    println(name)
}

//fun sum(x: Int, y: Int) = x + y                   // type inference by compiler
fun sum(x: Int, y: Int, z: Int = 0) = x + y + z     // parameters can have default values

fun printDetails(name: String, email: String = "", phone: String){
    println("name: $name - email: $email - phone: $phone")
}

fun printStrings(vararg strings: String){
    reallyPrintingStrings(*strings)     // * = spread operator, can pass varargs to functions
}

fun reallyPrintingStrings(vararg strings: String){
    for(string in strings)
        println(string)
}

fun main(args: Array<String>){
    hello()
    val value = returnsAFour()
    takingString("Some value")

    sum(1,2)
    sum(1,2,3)

    printDetails("diego", phone = "555 123")
    printDetails("diego", phone = "555 123", email = "mail@domain.es")  // can pass parameters in any order

    printStrings("1")
    printStrings("1","2","3")
}