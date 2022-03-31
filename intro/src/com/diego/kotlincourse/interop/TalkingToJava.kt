package com.diego.kotlincourse.interop

import com.diego.kotlincourse.classes.CustomerJava

fun main(args: Array<String>) {
    val customer = CustomerJava()
    customer.email =        // same as customer.getEmail()
        "email@mail.com"    // same as customer.setEmail()

    customer.prettyPrint()

    val runnable = Runnable { println("Invoking runnable") }

    val kr = KotlinCustomerRepo()
    val customerJava = kr.getById(10)
    customerJava.id

    customerJava.sometimesNull() // ! operator indicates platform types

}

class PersonKotlin: PersonJava() {

}

class RunnableKotlin: Runnable {
    override fun run() {
        TODO("Not yet implemented")
    }

}

class KotlinCustomerRepo: CustomerRepository{
    override fun getById(id: Int): CustomerJava {
        TODO("Not yet implemented")
    }

    override fun getAll(): MutableList<CustomerJava> {
        TODO("Not yet implemented")
    }

}