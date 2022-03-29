package com.diego.kotlincourse.tidbits

open class Person {

}

class Employee: Person(){
    fun vacationDays(days: Int){
        if(days < 60)
            println("needs more vacation")
    }
}

class Contractor: Person(){

}

fun hasVacations(obj: Person){
    if(obj is Employee)
        obj.vacationDays(20) // smart-casting: compiler knows the type of the variable (due to condition)

}

var input: Any = 10
fun main(args: Array<String>) {
    val str = input as? String // as? = safe cast
    //println(str?.length) // Integer cannot be cast to String
    println(str?.length) // prints null
}