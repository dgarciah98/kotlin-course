package com.diego.kotlincourse.nulls

import com.diego.kotlincourse.classes.CustomerJava

/*
class Service {
    fun evaluate(){

    }
}
class ServiceProvider{
    fun createServices(): Service? {

    }
}
*/

fun main(args: Array<String>) {
    val message: String = "Message"
    var nullMessage: String? = null  // if type has ? (elvis/safe) operator, it can be nullable
    val inferredNull = null

    println(message.length)

    //nullMessage = "Hello"      // can print String length once it's not null anymore

    //if (nullMessage != null)
    //    println(nullMessage.length)  // compiler error gone due to condition

    //val customerJava = CustomerJava()
    //if(customerJava != null && customerJava.name != null)
    //    println(customerJava.name.length)

    println(nullMessage!!.length) // safe operator makes the former condition implicit
                                  // non-null asserted (!!) operator forces null value
    //val sp = createServiceProvider()
    //sp?.createServices()?.evaluate()


}

//private fun createServiceProvider(): ServiceProvider? = ServiceProvider()