package com.diego.kotlincourse.functional

fun String.hello(){
    println("hello")
}

fun String.toTitleCase(prefix: String): String{
    return this.split(" ").joinToString(" ") { "$prefix "+it.capitalize()}
}

fun main(args: Array<String>) {
    val string = "Another"
    string.hello()
    "Hello".hello()

     println("this is a sample string to Title Case it".toTitleCase("Again"))

    val customer = Customer()
    customer.makePreferred("New version")

    val instance: BaseClass = InheritedClass()
    instance.extension() // extended function depends on the type whether it is statically resolved or inferred
}

class Customer {
    fun makePreferred(){
        println("Customer version") // member function takes preference over extended function if they are the same
    }
}

fun Customer.makePreferred(message: String){
    println("Extended version - $message")
}

open class BaseClass
class InheritedClass: BaseClass()
fun BaseClass.extension(){
    println("Base extension")
}
fun InheritedClass.extension(){
    println("Inherited extension")
}
