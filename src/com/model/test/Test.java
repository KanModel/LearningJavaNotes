package com.model.test;

/**
 * Created by kgdwhsk on 2016/10/2.
 */
public class Test {
    public static void main(String args[]){
        Object o = new Object();
        Test t = new Test();
        System.out.println(o.getClass().getName());
        System.out.println(t.getClass().getSuperclass().getName());
        System.out.println(t.getClass().getName());
    }
}
