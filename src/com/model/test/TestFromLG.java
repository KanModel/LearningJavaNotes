package com.model.test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by kgdwhsk on 2016/9/29.
 */
public class TestFromLG {
    public static void main(String args[]){
//        System.out.println(new TestFromLG().fun());
//        new TestFromLG().ArraysCompare();
//        new TestFromLG().testString();
        String s = null;
        s = new TestFromLG().changeValueS(s);
        System.out.println(s);
    }

    /*
    * main函数为static不能直接调用非static方法
    * */
    int fun(){
        return 20;
    }

    /*
    * ==比较地址
    * */
    void ArraysCompare(){
        int a1[] = {1,2,3};
        int a2[] = {1,2,3};
        if (a1 == a2){
            System.out.println("same");
        }else {
            System.out.println("No");
        }
        if (Arrays.equals(a1,a2)){
            System.out.println("same");
        }else {
            System.out.println("No");
        }
    }

    /*
    * 参数仅仅传递值
    * */
    void testString(){
        String s = null;
        changeValue(s);
        System.out.println(s);
    }
    void changeValue(String a){
        a = "GG";
    }
    String changeValueS(String a){
        a = "GG";
        return a;
    }
}
