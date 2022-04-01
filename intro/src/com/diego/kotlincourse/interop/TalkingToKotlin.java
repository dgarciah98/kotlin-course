package com.diego.kotlincourse.interop;

import com.diego.kotlincourse.classes.CustomerKotlin;
import com.diego.kotlincourse.classes.CustomerKotlinKt;
import com.diego.kotlincourse.classes.Status;

import javax.rmi.CORBA.Util;
import java.io.IOException;

public class TalkingToKotlin {
    public void loadStats(CustomerKotlin customerKotlin){
        try {
            customerKotlin.loadStatistics("filename");
        } catch (IOException e){ // @Throws for throwing exceptions that Java can catch
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CustomerKotlin customerKotlin = new CustomerKotlin(1,"diego","mail@mail.com", null);
        customerKotlin.setEmail("email@mail.com");
        String value = customerKotlin.someProperty;
        customerKotlin.changeStatus(Status.Current);
        customerKotlin.changeStatus(); // @JvmOverloads instructs the compiler to generate the default parameter
        customerKotlin.preferential(); // @JvmName tells the JVM to change the name of the function

        //TopLevelFunctionsKt.prefix("some","value");
        UtilityClass.prefix("some","value"); // @file:JvmName changes the name of the class
        //UtilityClass.getCopyrightYear();
        int copyrightYear = UtilityClass.CopyrightYear; // if const it has to be assigned

        CustomerKotlinKt.extension(customerKotlin); // extension functions need to be accessed from the actual class
                                                    // it also needs an instance of the class
    }
}
