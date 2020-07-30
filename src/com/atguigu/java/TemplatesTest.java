package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author gnuzsx
 * @date 2020/7/29 - 22:52
 * @create 2020-07-29-22:52
 *
 * IDEA中代码模板所处的位置，settings当中Lives templates，还有一个就是postfix completion
 *
 * 常用的模板都有哪些，
 */
public class TemplatesTest {

//    private static final
    public static final Customer CUST = new Customer();
    public static final int NUM2 = 1;
    public static final String NATION = "china";
    public static final int NUM = 1;

    //模板一、psvm
    public static void main(String[] args) {
        System.out.println("TemplatesTest.main");
        int num = 1;
        System.out.println("1 = " + 1);
        System.out.println("args = " + Arrays.deepToString(args));
    }
    public void method(){
        System.out.println("TemplatesTest.method");
    }
    public void method1(){
        String[] arr = new String[]{"Tom","Jerry","Haimeimei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }
    }
    public void method2(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);
        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }
    public void method3(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);
        if (list == null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }
        if (list != null) {

        }
    }
}
