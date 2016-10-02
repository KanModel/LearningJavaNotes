package com.model.Main;


import com.model.TIJ4.typeinfos.toys.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by kgdwhsk on 2016/9/11.
 */
public class MyRTTI {
    public static Random rand = new Random(47);

    public static void main(String args[]){
//        myR();
//        myClass();
        /*
        * Class.forName()要用全部包名
        * */
//        new ToyTest().main(args);
//        类字面常量();
//        泛化Class引用();
//        new FilledList<CountedInteger>(CountedInteger.class).main(args);
//        b567();
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
            Class.forName("com.model.Main.Gum");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Couldn't find Gum");
        }
        System.out.println("after class");
        new Cookie();
        System.out.println("After creating cookie");
    }

    public static void 类字面常量(){
        Class i = Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.sf);
        System.out.println(Initable.sf2);
        System.out.println(Initable2.snf);
        try {
            Class i3 = Class.forName("com.model.Main.Initable3");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("After creating initable3 ref");
        System.out.println(Initable3.snf);
    }

    public static void 泛化Class引用(){
        Class intClass = int.class;
//        Class ss = Integer.TYPE;
//        Class sss = Integer.class;
        Class<Integer> genericI = int.class;
        genericI = Integer.class;
        Class<?> ic = int.class;
        ic = double.class;
        Class<? extends Number> nu = int.class;
        nu = double.class;
        nu = Number.class;
    }

    public static void b567(){
        Class<subC> ft = subC.class;
        try {
            subC c = ft.newInstance();
            Class<? super subC> up = ft.getSuperclass();
            /*
            * 父类不能是抽象类？
            *
            * */
            Object object = up.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
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

    Gum(){
        System.out.println("\n Gum \n");
    }
}

class Cookie{
    static {
        System.out.println("Loading Cookie");
    }

    Cookie(){
        System.out.println("\n Cookie \n");
    }
}

class SuperC{

}

class subC extends SuperC{

}

class Initable{
    static final int sf = 47;
    static final int sf2 = MyRTTI.rand.nextInt(1000);
    static {
        System.out.println("一");
    }
}

class Initable2{
    static int snf =147;
    static {
        System.out.println("二");
    }
}
class Initable3{
    static int snf =74;
    static {
        System.out.println("三");
    }
}

class CountedInteger{
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}

class FilledList<T>{
    private Class<T> type;
    public FilledList(Class<T> type){
        this.type = type;
    }
    public List<T> create(int nElements){
        List<T> result = new ArrayList<T>();
        try {
            for (int i = 0; i <nElements; i++){
                result.add(type.newInstance());
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return result;
    }
    public static void main(String[] args){
        FilledList<CountedInteger> fl = new FilledList<CountedInteger>(CountedInteger.class);
        List<CountedInteger> countedIntegers = fl.create(15);
        System.out.println(countedIntegers);
        System.out.println(countedIntegers.get(0).getClass().getName());
    }
}