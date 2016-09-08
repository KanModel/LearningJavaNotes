package com.model;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import static com.model.util.Help.*;
/**
 * Created by kgdwhsk on 2016/7/28.
 */


public class Main{
    private static Main t;

    public static void main(String[] args){
        MyCollection.FirstTouchArrayList();
    }


    public static  Collection fill(Collection<String> co){
        co.add("rat");
        co.add("cat");
        co.add("dog");
        co.add("dog");
        return co;
    }

    public static  Map fill(Map<String,String > co){
        co.put("rat","Fuzzy");
        co.put("cat","Rags");
        co.put("dog","Bosco");
//        co.put("dog","Spot");
        co.put("aa","zuck");
        return co;
    }
}

class Do{
    private static long counter;
    private final long id = counter++;

    public static void main(String[] args){
        println("test");
    }
    Do(){
        println("Do " + id);
    }

    Do(int count){
        println(id + " Do");
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Do " + id;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        println("Do was dead!");
    }
}

class Orange extends Do{
    Orange(){
        super();
        println("Orange " + getId());
    }

    public String toString() {
        return "Orange " + getId();
    }
}
class Apple extends Do{

    Apple(){
        super();
        println(this);
    }

    @Override
    public String toString() {
        return "Apple " + getId();
    }
}


