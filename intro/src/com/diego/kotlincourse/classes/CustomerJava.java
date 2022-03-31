package com.diego.kotlincourse.classes;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

public class CustomerJava {
    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void prettyPrint(){
        System.out.printf("Id: %d - Name: %s",id,name);
    }

    public @NotNull String neverNull(){
        return "A string";
    }

    public String sometimesNull(){
        return "A string";
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerJava that = (CustomerJava) o;
        return id == that.id && name.equals(that.name) && email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    @Override
    public String toString() {
        return "CustomerJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
