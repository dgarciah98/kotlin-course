package com.diego.kotlincourse.generics

import com.diego.kotlincourse.classes.Customer

open class Person
class Employee: Person()

fun operate(person: List<Person>) {}

interface ReadOnlyRepo<out T>{ // 'out' indicates covariance
    fun getId(id: Int): T
    fun getAll(): List<T>
}

interface WriteRepo<in T>{ // 'in' indicates contravariance
    fun save(obj: T)
    fun saveAll(list: List<T>)
}

fun main(args: Array<String>) {
    operate(listOf<Employee>())
    operate(listOf<Person>())

    val ro = ReadOnlyRepoImpl<Customer>()
}