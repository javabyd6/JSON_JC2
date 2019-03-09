package com.sda.json;

public class Student
{
    private String name;
    private String lastName;
    private Address adress;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAdress() {
        return adress;
    }

    public Student(String name, String lastName, Address adress) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
    }
}
