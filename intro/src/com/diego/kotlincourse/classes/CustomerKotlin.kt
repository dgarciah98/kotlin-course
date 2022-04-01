package com.diego.kotlincourse.classes

import java.io.IOException

data class CustomerKotlin(var id: Int, var name: String, var email: String, val phone: String?){
    @JvmField val someProperty = "Value"
    override fun toString(): String {
        return "{\"id\": \"$name\", \"name\": \"$name\"}"
    }
    @JvmOverloads fun changeStatus(status: Status = Status.Current){
    }
    @JvmName("preferential") fun makePreferred(){

    }
    @Throws(IOException::class) fun loadStatistics(filename: String){
        if(filename == "")
            throw IOException("filename cannot be blank")
    }
}

fun CustomerKotlin.extension(){

}

enum class Status {
    Current,
    Past
}

fun main(args: Array<String>){
    val customer1 = CustomerKotlin(1,"diego","mail@domain.es",null)
    val customer2 = CustomerKotlin(2,"diego","mail@domain.es",null)
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