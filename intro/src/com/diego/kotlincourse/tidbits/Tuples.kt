package com.diego.kotlincourse.tidbits

import com.diego.kotlincourse.classes.CustomerKotlin

fun capitalAndPopulation(country: String): Pair<String, Long>{
    return Pair("Madrid",2300000)
}

fun countryInformation(country: String): Triple<String, String, Long>{
    return Triple("Madrid","Europe",2300000)
}

fun main(args: Array<String>) {
    val result = capitalAndPopulation("Spain")
    println(result.first)
    println(result.second)

    val countryInfo = countryInformation("Spain")
    println(countryInfo.third)

    val (capital, continent, population) = countryInformation("Spain")
    println(capital)
    println(continent)
    println(population)

    val (id,name,email) = CustomerKotlin(1, "diego","email@email")

    val listCapitalsAndCountries =
        listOf(Pair("Madrid","Spain"),"Paris" to "France") // 'to' operator works the same as a tuple

    for ((capital, country) in listCapitalsAndCountries)
        println("$capital - $country")

}
