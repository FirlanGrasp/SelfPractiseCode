package com.UC;

import java.util.concurrent.Exchanger;

public class TogetherTools {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();

        new Thread(() -> {
            try{
                String say = "我是AAA";
                String get = ex.exchange(say);
                System.out.println(Thread.currentThread().getName() + "收到的信息是" + get);
            }catch (Exception e){
                throw new RuntimeException();
            }
        }, "A").start();

        new Thread(() -> {
            try{
                String say = "我是BBB";
                String get = ex.exchange(say);
                System.out.println(Thread.currentThread().getName() + "收到的信息是" + get);
            }catch (Exception e){
                throw new RuntimeException();
            }
        }, "B").start();

    }
}
