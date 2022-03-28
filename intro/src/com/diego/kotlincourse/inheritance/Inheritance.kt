package com.diego.kotlincourse.inheritance

open class Person {
    open fun validate() {

    }
}

open class Customer: Person { // inheritance only is possible when classes are not final or closed
    override fun validate(){

    }
    constructor(): super(){

    }
}

class SpecialCustomer: Customer()  {
    override fun validate() {
        super.validate()
    }
}

data class CustomerEntity(val name: String): Person()

fun main(args: Array<String>) {
    val customer = Customer()
    customer.validate()
}