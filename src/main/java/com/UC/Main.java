package com.UC;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        String[] str = new String[num];

        for(int i = 0;i<num;i++){
            str[i] = in.next();
            solve(str[i]);
        }

    }

    public static void solve(String str){
        StringBuilder builder = new StringBuilder();
        int p = 0;
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if( c >= '0' && c <= '9'){
                if(p == 0) { p = c - '0';}
                else{
                    p = p * 10 + c - '0';
                }
            }else{
                if(builder.length()>0) {
                    p = p % builder.length();
                    StringBuilder tempF = new StringBuilder(builder.substring(0, p));
                    StringBuilder tempB = new StringBuilder(builder.substring(p, builder.length()));
                    builder = tempB.append(tempF);
                }
                p = 0;
                if( c != 'R'){
                    builder.append(c);
                }else{
                    char[] temp1 = builder.toString().toCharArray();
                    char[] temp2 = new char[temp1.length];
                    int len = temp1.length;
                    for(int j = 0;j < temp1.length; j++){
                        temp2[len - j -1] = temp1[j];
                    }
                    String temp = new String(temp2);
                    builder = new StringBuilder(temp);
                }
            }
        }
        System.out.println(builder.toString());
    }
}