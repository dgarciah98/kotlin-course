package com.diego.kotlincourse.functional

fun operation(x: Int, y: Int, op: (Int,Int) -> Int): Int{
    return op(x,y)
}

fun operation(x: Int, op: (Int) -> Int){

}

fun route(path: String, vararg actions: (String, String) -> String) {

}

fun unaryOperation(x: Int, op: (Int) -> Int){

}

fun unaryOp(op: (Int) -> Int){

}

fun sum(x: Int, y: Int) = x + y

fun transaction(db: Database, code: () -> Unit){
    try{
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit(){}
}

fun main(args: Array<String>) {
    println(operation(1,2,::sum))

    val sumLambda: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    println(operation(1,2, sumLambda))
    println(unaryOperation(2) { x -> x * x }) // putting the lambda outside also works
    println(unaryOperation(3) { it * it })
    println(unaryOp {
        it*it
    })

    val db = Database()
    transaction(db){
        // interaction
        // code written here is encapsulated in code()
    }

    unaryOperation(3, fun(x: Int): Int { return x*x}) // anonymous function
}