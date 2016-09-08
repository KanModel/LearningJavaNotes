package com.model;

import java.util.*;

import static com.model.util.Help.println;

/**
 * Created by kgdwhsk on 2016/9/7.
 * 学习持有对象基础内容
 */
public class MyCollection {
    public static void main(String args[]){
//        FirstTouchArrayList();
//        CollectionAddElement();
        PrintCollection();

    }

    /*
        * Mark第一个创建的容器
        * ArrayList含有以下方法：
        * 1、add
        * 2、get
        * 3、size
        * 4、remove
        * */
    public static void FirstTouchArrayList(){
        ArrayList<Do> apples = new ArrayList<Do>();
        for (int i = 0;i < 4;i++){
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (int i = 0;i < apples.size();i++){
            System.out.println(apples.get(i));
        }
        if (apples.get(0) == null){
            System.out.println("It is NULL!");
        }else {
            System.out.println("Not null");
            System.out.println(apples.get(0));
        }
        System.out.println(apples.get(4));
        println(apples);
        apples.remove(1);
        println(apples);
        apples.add(new Apple());
        println(apples);
        apples.remove(1);
        println(apples);
    }

    /*
        * Mark容器添加元素
        * 1、使用Collection的构造器
        * 2、使用Collection类的addAll方法
        * 3、使用Collections.addAll方法第一个参数为Collection对象
        * */
    public static void CollectionAddElement(){
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        Integer[] moreInts = {6,7,8};
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection,11,12,13);
        println(collection);
        Collections.addAll(collection,moreInts);
        println(collection);
        List<Integer> list = Arrays.asList(16,17,18);
        println(list);
        list.set(0,99);
        println(list);
    }

    /*
    * 容器的打印
    * */
    public static void PrintCollection(){
        println(fill(new ArrayList<String>()));
        println(fill(new LinkedList<String>()));
        println(fill(new HashSet<String>()));
        println(fill(new TreeSet<String>()));
        println(fill(new LinkedHashSet<String>()));
        println(fill(new HashMap<String, String>()));
        println(fill(new TreeMap<String, String>()));
        println(fill(new LinkedHashMap<String, String>()));
    }

    static Collection fill(Collection<String> collection){
        collection.add("First");
        collection.add("Second");
        collection.add("Third");
        collection.add("Fourth");
        return collection;
    }

    static Map fill(Map<String,String> map){
        map.put("First","一");
        map.put("Second","二");
        map.put("Third","三");
        map.put("Fourth","四");
        return map;
    }
}
