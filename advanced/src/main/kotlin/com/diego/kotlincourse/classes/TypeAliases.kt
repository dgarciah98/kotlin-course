package com.diego.kotlincourse.classes

typealias Name = String
typealias Email = String

data class Employee(val name: Name, val email: Email) {
    fun printName(string: String){}
}

fun main(args: Array<String>) {
    val employee = Employee("diego","mail@mail.com")
    employee.printName("name")
}