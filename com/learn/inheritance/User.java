package com.learn.inheritance;

public class User extends Humans{
    String name;
    String address;
    long mob;

    public void helloUser(){
        System.out.println("Hello from User");
    }
    public void introduction(){
        System.out.println("Hello i am User");
    }
}
