package com.model;


import java.util.Arrays;
import java.util.List;

/**
 * Created by kgdwhsk on 2016/9/11.
 */
public class MyRTTI {
    public static void main(String args[]){
//        myR();
        myClass();
    }

    public static void myR(){
        List<Shape> shapeList = Arrays.asList(new Circle(),new Square(),new Triangle());
        for (Shape shape:shapeList){
            shape.draw();
        }
    }

    public static void myClass(){
        System.out.println("inside main");
        new Candy();
        System.out.println("After");
        new Gum();
        try {
            Class.forName("Gum");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Couldn't find Gum");
        }
        System.out.println("after class");
        new Cookie();
        System.out.println("After creating cookie");
    }
}

abstract class Shape{
    void draw(){
        System.out.println(this + ".darw()");
    }

    abstract public String toString();
}

class Circle extends Shape{
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape{
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape{
    @Override
    public String toString() {
        return "Shape";
    }
}

class Candy{
    static {
        System.out.println("Loading Candy");
    }
}

class Gum{
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie{
    static {
        System.out.println("Loading Cookie");
    }
}