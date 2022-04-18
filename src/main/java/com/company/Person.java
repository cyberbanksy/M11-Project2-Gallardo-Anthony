package com.company;

public class Person {
    // state or properties
    protected String name;
    protected double salary;
    private double earnedIncome;

    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setEarnedIncome(double earnedIncome){
        this.earnedIncome = earnedIncome;
    }
}
