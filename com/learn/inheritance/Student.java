package com.learn.inheritance;

public class Student extends User{
    int rollNumber;
    String schoolName;

    public void displayStudent(){
        System.out.println("Helllo from Student");
    }
    public void introduction(){
        System.out.println("Hello i am Student");
    }
}
