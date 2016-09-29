package com.model.test;

/**
 * Created by kgdwhsk on 2016/9/29.
 */
public class TestFromLG {
    public static void main(String args[]){
        System.out.println(new TestFromLG().fun());
    }

    /*
    * main函数为static不能直接调用非static方法
    * */
    int fun(){
        return 20;
    }
}
