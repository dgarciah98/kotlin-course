package com.diego.kotlincourse.basics

fun main(args: Array<String>){
    var streetNumber = 10
    var streetName = "High Street"

    val zip = "E11 P1"
    streetName = "Pudding Lane" // var == mutable (variable
    // zip = "E12 P2"           // val == inmutable (value)

    val myLong = 10L    // L == Long
    val myFloat = 100F  // F == Float
    val myHex = 0x0F
    val myBinary = 0xb01

    val myInt = 100
    //val myLongAgain: Long = myInt     // Type mismatch
    val myLongAgain: Long = myInt.toLong()

    // Strings
    val myChar = 'A'
    val myString = "String"

    val escapeCharacters = "A new line \n"
    val rawString =
            "Hello" +
            "Second line" +
            "Third line"
    val multipleLines = """
        String
        Second line
        """

    val years = 10
    val message = "A decade is $years years"
    val name = "Mary"
    val anotherMessage = "Lenght of $name is ${name.length}"

}