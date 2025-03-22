package com.UC;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class StringPractice {

    public static void main(String[] args) {
        String str1 = "Hello World";

        System.out.println(str1.charAt(7));
        System.out.println(str1.toCharArray());
        System.out.println(str1.indexOf("World"));

        System.out.println("A".toLowerCase());
        System.out.println("b".toUpperCase());

        String[] str2 = str1.split(" ");
        for (int i = 0; i< str2.length; i++){
            System.out.println(str2[i]);
        }

        String str3 = "   ffsd fs ";
        System.out.println(str3.trim());

        System.out.println(str1.substring(0,3));
        System.out.println(str1.contains("Hello"));


    }
}
