package com.model.Main;

/**
 * Created by kgdwhsk on 2016/8/8.
 */
public class MyThread implements Runnable{

    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public MyThread(){

    }

    public MyThread(int countDown){
        this.countDown = countDown;
    }

    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + "),";
    }

    @Override
    public void run() {
        while (countDown-- > 0){
            System.out.println(status());
            Thread.yield();
        }
    }
}
