package com.example.test1.models;
import java.io.Serializable;

public class FootballPlayer implements Serializable {
    private int number;
    private String position;
    private double salary;
    private int age;
    private String firstName;
    private String lastName;


    public FootballPlayer(int number, String position, double salary, int age, String firstName, String lastName) {
        this.number = number;
        this.position = position;
        this.salary = salary;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPosition(){
        return position;
    }
    public int getNumber(){
        return number;
    }
    public Double getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }
    public void setLastName (String surname){
        this.lastName = surname;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setAge(int age){
        this.age = age;
    }

}