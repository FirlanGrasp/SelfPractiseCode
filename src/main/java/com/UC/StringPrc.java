package com.UC;

import java.util.Scanner;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class StringPrc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        num = scanner.nextInt();
        String[] str = new String[num];
        scanner.nextLine();

        for(int i = 0;i<num;i++){
            str[i] = scanner.nextLine();
            str[i] = str[i].toLowerCase();
            System.out.println(str[i]);
        }

        StringBuilder builder  = new StringBuilder();

        for(int i = 0; i< str.length; i++){
            builder.append(str[i]);
        }
        System.out.println(builder.toString());

        System.out.println(str[0].indexOf("world"));


        System.out.println(str[0].substring(3,6));

    }
}

class prc{
    public static void main(String[] args) {
        String str = "hello hello";

        System.out.println(str.replaceFirst("hello","hi"));

        String str1 = "  hello  hello  ";
        System.out.println(str1.trim());

        String str2 = "hello";
        System.out.println(str1.contains(str2));
        System.out.println(str2.startsWith("he"));
        System.out.println(str2.endsWith("lo"));

        String[] stra = {"hello","world"};
        System.out.println(String.join(str1,stra));

        System.out.println(str.repeat(3));

        int num = 0;
        System.out.println(String.valueOf(num));



    }
}
