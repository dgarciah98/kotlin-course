package com.diego.kotlincourse.classes

data class CustomerKotlin(var id: Int, var name: String, var email: String){
    override fun toString(): String {
        return "{\"id\": \"$name\", \"name\": \"$name\"}"
    }
}

fun main(args: Array<String>){
    val customer1 = CustomerKotlin(1,"diego","mail@domain.es")
    val customer2 = CustomerKotlin(2,"diego","mail@domain.es")
    println(customer1)

    val customer3 = customer1
    if(customer1 == customer2)
        println("They are the same")

    println(customer3.id)
    val customer4 = customer1.copy(email = "diego@mail.com")
    println(customer4.id)
    println(customer4.name)
    println(customer4.email)
}