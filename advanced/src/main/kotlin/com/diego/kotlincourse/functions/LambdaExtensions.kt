package com.diego.kotlincourse.functions

class Request(val method: String, val query: String, val contentType: String)
class Response(var contents: String, var status: Status) {
    fun status(status: Status.() -> Unit) {}
    operator fun invoke(status: Status.() -> Unit) {}
}

class Status(var code: Int, var description: String)
class RouteHandler(val request: Request, val response: Response){
    var executeNext = false
    fun next(){
        executeNext = true
    }
}

//fun response(response: Response.() -> Unit) {}

fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f

fun main(args: Array<String>) {
    routeHandler("/index.html") {
        if(request.query != ""){
            //process
        }
        response {
            //status {
                code = 404
                description = "Not Found"
            //}
        }
    }

    val manager = Manager()
    manager("do something")
}

class Manager {
    operator fun invoke(value: String){ // this allows to invoke a function using only the instance

    }
}