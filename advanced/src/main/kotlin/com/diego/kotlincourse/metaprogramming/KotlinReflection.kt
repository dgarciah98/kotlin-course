package com.diego.kotlincourse.metaprogramming

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

fun main(args: Array<String>) {
    println(Transaction::class)
    val classInfo = Transaction::class
    classInfo.members.forEach {
        println("Property ${it.name} of type ${it.returnType}")
    }
    classInfo.constructors.forEach {
        println("Constructor ${it.name} - ${it.parameters}")
    }
    getKotlinType(Transaction::class)

    val constructor = ::Transaction
    println(constructor)

    //val transaction = constructor.call(1, 2000, "Some description")
    //val transaction = constructor.call(1, 2000,) // Callable expects 3 parameters
    val transaction1 = constructor.callBy(mapOf(
        constructor.parameters[0] to 1,
        constructor.parameters[1] to 2000)
    )

    //val validateFunc = Transaction::validate val id
    val idParam = constructor.parameters.first { it.name == "id" }
    val amountParam = constructor.parameters.first { it.name == "amount" }
    val transaction2 = constructor.callBy(mapOf(idParam to 1, amountParam to 2000))

    val trans = Transaction(1, 20.0, "new value")
    val nameProperty = Transaction::class.memberProperties.find {it.name == "description"}
    println(nameProperty?.get(trans))


    println(transaction2.description)
}