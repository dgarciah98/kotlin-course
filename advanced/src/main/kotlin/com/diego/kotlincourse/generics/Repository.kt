package com.diego.kotlincourse.generics

import java.io.Serializable

open class Entity(val id: Int)

class CustomerEntity(id: Int) : Entity(id) {

}

fun <T: Serializable> streamObject(obj: T){}

// T === Any?
//class Repository<T> where T: Entity, T: Serializable {  // 'where' is similar to extends in Java
class Repository<T: Entity>  {
    fun save(entity: T){
        if (entity.id != 0){}
    }
}

fun main(args: Array<String>) {
    val repo = Repository<CustomerEntity>()
}