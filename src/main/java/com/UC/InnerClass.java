package com.UC;

public class InnerClass {

    private int a = 8;

    public class Inner{
        public void print(){
            System.out.println(a);
        }
    }

    public static class StaticInner{
        public void print(){
            System.out.println("Static Class");
        }
    }


    public static void main(String[] args) {
        System.out.println("----------");
        InnerClass innerClass = new InnerClass();
        InnerClass.Inner inner = innerClass.new Inner();
        inner.print();
        System.out.println("----------");
        InnerClass.StaticInner staticInner = new InnerClass.StaticInner();
        staticInner.print();
        System.out.println("----------");

        class MethodInner{
            public void print(){
                System.out.println("methodInner");
            }
        }

        MethodInner methodInner = new MethodInner();
        methodInner.print();

        System.out.println("----------");

        Interface interface_ = new Interface() {
            @Override
            public void print() {
                System.out.println("interfaceInner");
            }
        };
        interface_.print();

    }
}

interface Interface{
    void print();
}