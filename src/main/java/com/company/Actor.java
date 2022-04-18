package com.company;

<<<<<<< HEAD
public class Actor {
=======
public class Actor extends Person {
    private String role;

    public Actor(String name, double salary, String role){
        super(name,salary);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
>>>>>>> 4c106dd1676b3e75dbb13e3ed02d0e3d4ba30e46
}
