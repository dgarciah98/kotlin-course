package com.diego.kotlincourse.classes

interface Repository {
    fun getAll(): List<Customer>
}

class CustomerController(){
    //var repository: Repository? = null
    lateinit var repository: Repository
    fun index(): String {
        return repository.getAll().toString()
    }
}

fun main(args: Array<String>) {
    val customerController = CustomerController()
    customerController.index() // exception due to value not being initialized (yet) before calling function
}