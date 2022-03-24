package com.diego.kotlincourse.classes

import java.util.Calendar

class Customer(var id: Int, var name: String, val yearOfBirth: Int) {  // can pass properties directly as parameters
    //init { name = name.uppercase() }
    //constructor(email: String): this(0, ""){}
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth
    var socialSecurityNumber: String = ""
        set(value){
            if (!value.startsWith("SN"))
                throw IllegalArgumentException("Social security number should start with SN")
            field = value
        }

    fun customerAsString(): String{
        return "Id: $id - Name: $name"
    }
}

fun main (args: Array<String>){
    val customer = Customer(10, "diego", 1998)
    //val customer2 = Customer(10)
    customer.name
    customer.id
    customer.socialSecurityNumber = "SN1234"

    println(customer.customerAsString())

    println(customer.name)
    println(customer.age)
    println(customer.socialSecurityNumber)
}