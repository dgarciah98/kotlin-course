package com.diego.kotlincourse.interop;

import com.diego.kotlincourse.classes.CustomerJava;

import java.util.List;

public interface CustomerRepository {
    CustomerJava getById(int id);
    List<CustomerJava> getAll();
}
