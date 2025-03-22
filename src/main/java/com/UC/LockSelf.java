package com.UC;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockSelf {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.lock();
        try{
            System.out.println("hello");
        }finally{
            lock.unlock();
        }
    }

}
