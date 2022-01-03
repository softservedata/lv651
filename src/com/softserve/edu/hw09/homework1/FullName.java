package com.software.edu.hw09.homework1;

public abstract class FullName {
    protected String firstName;
    protected   String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public FullName(){
        firstName = "";
        lastName = "";
    }

}
