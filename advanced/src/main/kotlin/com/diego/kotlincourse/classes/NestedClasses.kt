package com.diego.kotlincourse.classes

class DirectoryExplorer(val user: String = "") {
    fun listFolder(folder: String, user: String){
        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }

    class PermissionCheck {
        fun validatePermission() {

        }

    }
}

fun main(args: Array<String>) {
    val de = DirectoryExplorer("diego")
    val pc = DirectoryExplorer.PermissionCheck()
}