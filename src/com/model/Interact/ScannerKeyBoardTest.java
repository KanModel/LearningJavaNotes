package com.model.Interact;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by kgdwhsk on 2016/10/17.
 */
public class ScannerKeyBoardTest {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
//        while (scanner.hasNext()){
//            String arg = scanner.next();
//            if (arg.equals("q"))
//                return;
//            System.out.println("Text:" + arg);
//        }
        /*while (scanner.hasNextLong()){
            Long arg = scanner.nextLong();
            if (arg == 9)
                return;
            System.out.println("Text:" + arg);
        }*/
//        readFile(new File("ArgTest.java"));
        File file = new File("E:\\Main\\WorkSpace\\untitled\\src\\com\\model\\Interact\\ScannerKeyBoardTest.java");
        System.out.println(file.getAbsoluteFile());
//        readFile(file);
//        keyboardIn();
        systemTest();
    }

    public static void readFile(File file){
        try{
            Scanner scanner = new Scanner(file);
            System.out.println(file.getName());
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void keyboardIn(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            while((line = bufferedReader.readLine()) != null){
                System.out.println("sss:" + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void systemTest(){
        Map<String,String> env = System.getenv();
        for (String name :env.keySet()){
            System.out.println(name + ":" + env.get(name));
        }
        System.out.println(System.getenv("JAVA_HOME"));
        Properties properties = System.getProperties();
//        try {
//            properties.store(new FileOutputStream("prop.txt"),"System Properties");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(System.getProperty("os.name"));
    }
}
