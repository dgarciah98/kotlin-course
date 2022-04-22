package com.diego.kotlincourse.functions

data class Time(val hours: Int, val mins: Int){
    operator fun plus(time: Time): Time {     // "operator" modifier overloads the + operator
        val minutes = this.mins + time.mins   // this way you can call this function using + operator
        val hoursInMinutes = minutes / 60
        val remainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remainingMinutes)
    }
}

operator fun StringBuilder.plus(stringBuilder: StringBuilder){
    stringBuilder.forEach { this.append(it) }
}

fun main(args: Array<String>) {
    val newTime = Time(13,40) + Time(3,20)
    println(newTime)

    val sb = StringBuilder()
    for(str in sb)
        str + "Value"
}