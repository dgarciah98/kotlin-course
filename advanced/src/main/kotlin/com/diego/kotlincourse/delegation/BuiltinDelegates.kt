package com.diego.kotlincourse.delegation

import kotlin.properties.Delegates

typealias Name = String
typealias Email = String

data class Employee(val name: Name, val email: Email) {
    fun printName(string: String){}

    var department: String by Delegates.observable("", {property, oldValue, newValue ->
        println("Property ${property.name} - from $oldValue to $newValue")
    })
}

fun main(args: Array<String>) {
    val employee = Employee("diego","mail@mail.com")
    employee.printName("name")
    employee.department = "IT"
}