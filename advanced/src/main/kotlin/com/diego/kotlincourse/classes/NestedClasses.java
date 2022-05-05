package com.diego.kotlincourse.classes;

public class NestedClasses {
    public static void main(String[] args) {
        //DirectoryExplorer.PermissionCheck pc = new DirectoryExplorer.PermissionCheck();
        //Log log = Log.Factory.createFileLog("file.txt");
        Log log = Log.createFileLog("file.txt");
        //Log logDirectly = Log() // we can't access either
    }
}
