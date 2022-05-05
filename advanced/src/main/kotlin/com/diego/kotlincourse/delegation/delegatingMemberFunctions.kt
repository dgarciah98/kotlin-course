package com.diego.kotlincourse.delegation

import com.diego.kotlincourse.classes.Customer

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}
interface Logger{
    fun logAll(){}
}

class Controller(repo: Repository, logger: Logger): Repository by repo, Logger by logger{
    // by delegating repo, which is passed from the parameter to the output,
    // the property becomes a dependency and cannot be accessed
    // and also it doesn't need to, but its methods can be called

    //fun index(): String {}
}