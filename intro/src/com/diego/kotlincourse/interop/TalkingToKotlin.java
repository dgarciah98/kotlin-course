package com.diego.kotlincourse.interop;

import com.diego.kotlincourse.classes.CustomerKotlin;
import com.diego.kotlincourse.classes.Status;

public class TalkingToKotlin {
    public static void main(String[] args) {
        CustomerKotlin customerKotlin = new CustomerKotlin(1,"diego","mail@mail.com", null);
        customerKotlin.setEmail("email@mail.com");
        String value = customerKotlin.someProperty;
        customerKotlin.changeStatus(Status.Current);
    }
}
