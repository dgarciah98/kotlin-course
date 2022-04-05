package com.diego.kotlincourse.stdlib

import java.io.File

fun main(args: Array<String>) {
    val file = File("filename.txt")
    if(file.isAbsolute){
        //...
        file.name
    }
    with(file){
        // can be used to replace if(file.isAbsolute) for example
    }

    val string: String? = ""
    string?.let { // same with 'with', for object that could be nullable
        it.length
    }
}