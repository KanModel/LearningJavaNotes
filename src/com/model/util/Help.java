package com.model.util;

import java.util.Objects;

/**
 * Created by kgdwhsk on 2016/7/28.
 */
public class Help {
    public static void print(Object str){
        System.out.print(str);
    }
     public static void print(){
            print("Nothing");
     }

    public static void println(Object str){
        System.out.println(str);
    }

    public static void println(){
//        println("Nothing");
        System.out.println();
    }
}
