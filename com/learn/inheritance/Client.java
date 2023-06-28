package com.learn.inheritance;

public class Client {
    public static void main(String[] args) {
        // Object of Student is passed
        createObject(new Student());
        System.out.println("----------------------------------------");
        //Object of user is passed
        createObject(new User());
        System.out.println("----------------------------------------");
        //Object of teacher is passed
        createObject(new Teacher());

    }

    public static void createObject(User user){
        user.introduction();
    }
}
