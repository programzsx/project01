package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

//这是我们的注释的内容
public class HelloWorld {

    private static final int SIZE = 10;
    private static int num;
    private FileInputStream fileInputStream;

    public static void main(String[] args) {
        //region Description
        System.out.println("HelloWorld!!");
        ArrayList list1 = new ArrayList();
        Date date = new Date();
        //endregion
//        method();
        System.out.println(list1);
    }

    public static void method() {
        try {
            FileInputStream fileInputStream = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }
}

