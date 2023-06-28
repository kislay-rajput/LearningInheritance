package com.learn.inheritance;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    public void getArea(){
        System.out.println("The area of the given radius will be: " + Math.PI * radius*radius);
    }
    public void getPerimeter(){
        System.out.println("The perimeter of the given radius will be: "+ 2 * Math.PI*radius);
    }
}
