package com.diego.kotlincourse.metaprogramming

import java.lang.reflect.Type

class Transaction(val id: Int, val amount: Double, var description: String = "default"){
    fun validate(){
        if(amount > 10000)
            println("com.diego.kotlincourse.metaprogramming.Transaction is too large")
    }
}

fun introspectInstance(obj: Any){
    println("Class ${obj.javaClass.simpleName}")
    println("Properties\n")
    obj.javaClass.declaredFields.forEach { println("${it.name} of ${it.type}") }
    println("Functions\n")
    obj.javaClass.declaredMethods.forEach { println("${it.name}") }


}

fun getType(obj: Type) {
    println(obj.typeName)
}

fun main(args: Array<String>) {
    introspectInstance(Transaction(1,200.0,"simple transaction"))
    getType(Transaction::class.java)
}