package com.test;

import com.sun.xml.internal.fastinfoset.stax.factory.StAXOutputFactory;

import java.util.*;

/**
 * 这是一个测试文件
 */
public class HelloWorld {
    public static final int initsize;

    static {
        initsize = 10;
    }

    public static void main(String[] args) {
        int[] ints = new int[5];
        for (int i = ints.length - 1; i >= 0; i--) {
            int anInt = ints[i];
            
        }

        Vector<String> dayNames = new Vector<>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        Enumeration<String> days = dayNames.elements();
        while (days.hasMoreElements()) {
            String s =  days.nextElement();
            
        }

        String str = "a,b,c,d";
        for (StringTokenizer stringTokenizer = new StringTokenizer(str); stringTokenizer.hasMoreTokens(); ) {
            String s = stringTokenizer.nextToken();
            
        }

    }




    /**
     * @param name
     */
    public static void sayName(String name) {
        List list1 = new ArrayList();
        list1.add(0,new Object());
    }

}
