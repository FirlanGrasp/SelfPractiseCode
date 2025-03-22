package com.UC;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class ThreadPrc {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            System.out.println("Thread 1 is running");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 1 is stopped");
        });

        Thread thread2 = new Thread(()->{
            System.out.println("Thread 2 is running");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 2 is stopped");
        });

        Thread thread3 = new Thread(()->{
            System.out.println("Thread 3 is running");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 3 is stopped");
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        thread3.start();

    }
}

class TreadPrc2{
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new TreadPrc2.MyThread();
        thread1.start();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("first" + thread1.isInterrupted());
        thread1.interrupt();
    }

    private static class MyThread extends Thread{

        @Override
        public void run() {
            try {
                System.out.println("Thread 1 is running");
                Thread.sleep(20000);
            }catch (InterruptedException e){
                e.printStackTrace();
                System.out.println("im" + Thread.currentThread().isInterrupted());
            }
        }
    }
}

class ThreadPrc3{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                System.out.println(Thread.currentThread().getName() + " run is running");
            }
        });

        Thread thread2 = new Thread(new FutureTask<String>(
            new Callable<String>(){
                @Override
                public String call(){

                    System.out.println(Thread.currentThread().getName() + " call is running");
                    return Thread.currentThread().getName() + " call is running";
                }
            }
        ));

        thread1.start();
        thread2.start();

    }
}

class ThreadPrc4{
    static Deque<String> queue = new LinkedList<String>();

    class Process{
        public synchronized void producer() throws InterruptedException {
            queue.add("Prodcut");
            System.out.println("已生产");
            TimeUnit.SECONDS.sleep(5);
            notify();
            wait();
        }
        public synchronized  void consume() throws InterruptedException {
            queue.poll();
            System.out.println("以消费");
            notify();
            wait();
        }
    }

    public static void main(String[] args) {
        ThreadPrc4 threadPrc4 = new ThreadPrc4();
        Process process = threadPrc4.new Process();

        Thread thread1 = new Thread(() ->{
           try {
               process.producer();
           }catch (Exception e){
               e.printStackTrace();
           }
        });

        Thread thread2 = new Thread(() ->{
            try {
                process.consume();
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
    }
}