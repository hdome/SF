package com.example;

/**
 * A class that represents an employee with attributes.
 */


public class Employee {

    @Shareable(value = true)
    private String name;
    @Shareable
    private String address;
    @Shareable(value = true)
    private int age;
    @Shareable
    private String texNumber;
    @Shareable
    private String bankAccount;
}
