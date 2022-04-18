package com.company;

<<<<<<< HEAD
public class Crew {
=======
public class Crew extends Person {
    private String department;

    public Crew(String name,double salary,String department){
        super(name,salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
>>>>>>> 4c106dd1676b3e75dbb13e3ed02d0e3d4ba30e46
}
