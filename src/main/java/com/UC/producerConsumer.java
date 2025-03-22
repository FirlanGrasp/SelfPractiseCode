package com.UC;

public class producerConsumer {
    //初始化队列
    //Deque
    //设置


    //生产者
    /*
    判断是否为5个，否则wait
    while(true){
        sychronized(queue){
            while(满了) wait
            打印开始生产
            生产...
            notify消费者
        }

    }
    sleep模拟生产延时
     */

    //消费者
    /*
    判断是否为0个，否则wait
    while(true){
        打印开始消费
        消费...
        notify生产者
    }
    sleep模拟消费延时
     */

    //主函数
    /*
    new 一个producerConsumer
    new 两个线程

    每个线程重写run方法：
    try(){
        producerConsumer.生产
    }catch

    try(){
        producerConsumer.消费
    }catch

    start
     */


    public static void main(String[] arg){


    }

}
