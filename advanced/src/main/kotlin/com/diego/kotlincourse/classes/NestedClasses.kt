package com.diego.kotlincourse.classes

class DirectoryExplorer(val user: String = "") {
    fun listFolder(folder: String, user: String){
        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }

    inner class PermissionCheck {
        fun validatePermission() {
            if(user != "diego"){

            }
        }

    }
}

fun main(args: Array<String>) {
    val de = DirectoryExplorer("diego")
    //val pc = DirectoryExplorer.PermissionCheck()
    val pc = DirectoryExplorer().PermissionCheck() // when using 'inner'
}