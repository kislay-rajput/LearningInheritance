package com.learn.inheritance;

public class Rectangle extends Shape{
    int length;
    int breadth;
    public void getArea(){
        if(length>0 && breadth>0)
        System.out.println("Area of the given rectangle will be: " +  length*breadth);
    }
}
