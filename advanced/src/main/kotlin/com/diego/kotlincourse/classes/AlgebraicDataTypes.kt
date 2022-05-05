package com.diego.kotlincourse.classes

//class PageResult(val result: String, var isError: Boolean)
sealed class PageResult { // 'sealed' purpose is to make nested classes to only inherit from PageResult
                          // and they have to be in the same file
}
class Success(val content: String): PageResult()
class Error(val code: Int, val message: String): PageResult()
class MediumSuccess(): PageResult()

fun getURLPage(url: String): PageResult {
    val wasValidCall = false

    return if(wasValidCall) Success("the content")
    else Error(404, "ERROR")
}

fun main(args: Array<String>) {
    val pageResult = getURLPage("/")
    //if (pageResult.isError)
    when (pageResult){
        is Success   -> println(pageResult.content)
        is Error     -> println(pageResult.message)
    }
}