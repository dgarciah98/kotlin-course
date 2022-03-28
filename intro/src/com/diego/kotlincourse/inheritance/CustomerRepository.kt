package com.diego.kotlincourse.inheritance

interface CustomerRepository {
    val isEmpty: Boolean
        get() = true
    fun store(obj: Customer) {

    }
    fun getById(id: Int): Customer
}

interface EmployeeRepository{
    fun store(obj: Employee){

    }
    fun getById(id: Int): Employee
}

class SQLCustomerRepo: CustomerRepository {
    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun store(obj: Customer) {
        super.store(obj)
    }

    override val isEmpty: Boolean
        get() = false
}

interface Interface1 {
    fun funA(){
        println("Fun A from Interface 1")

    }
}

interface Interface2 {
    fun funA(){
        println("Fun A from Interface 2 ")

    }
}

class Class1And2: Interface1, Interface2 {
    override fun funA() {
        println("Our own")
        super<Interface2>.funA()
    }
}

fun main(args: Array<String>) {
    val c = Class1And2()
    c.funA()
}