package com.diego.kotlincourse.classes

class Log private constructor() { // 'private constructor()' hides the constructor
    companion object Factory {
        @JvmStatic fun createFileLog(filename: String): Log = Log(filename)
        // @JvmStatic provides the same result as 'companion' when using Java
    }
    constructor(filename: String): this() {

    }
}

fun main(args: Array<String>) {
    //val log = Log.Factory.createFileLog("file.txt")
    //val fileLog = Log.createFileLog("file.txt")
    val log = Log.createFileLog("file.txt") // using 'companion' automatically access the object without calling it
    //val myLog = Log() // Log is private so we can't access the constructor
}