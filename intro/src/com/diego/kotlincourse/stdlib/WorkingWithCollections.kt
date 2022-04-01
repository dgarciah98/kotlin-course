package com.diego.kotlincourse.stdlib

import java.util.*

fun main(args: Array<String>) {
    var list = listOf("First","Second")
    var emptyList = emptyList<String>()

    val numbers = 1..100
    val cities = listOf("Madrid","London","Paris")

    println(cities.javaClass)
    println(emptyList.javaClass)

    val arrayList = Arrays.asList("Madrid","London")
    println(arrayList.javaClass)

    val mutableCities = mutableListOf("Madrid")
    mutableCities.add("London")

    val hashMap = hashMapOf(Pair("Madrid","Spain"), Pair("Paris","France"))
    val booleans = booleanArrayOf(true, false, true)
    val chars = charArrayOf('a', 'b', 'b')
}