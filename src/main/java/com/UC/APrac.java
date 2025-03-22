package com.UC;


public class APrac implements temp{

    @Override
    public void print() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        APrac a = new APrac();
        a.print();
    }

}


interface temp{
    int a = 8;
    void print();
}


