package com.UC;

import java.lang.reflect.Method;

public class ClassPrc {

    private String className;
    private void method1() {
        System.out.println("ClassPrc.method1");
    }

    public void method2() {
        System.out.println("ClassPrc.method2");
    }

    public static void main(String[] args) {
        Class<?> clazz = ClassPrc.class;
        Method[] methodsPublic = clazz.getMethods();
        Method[] methodsPrivate = clazz.getDeclaredMethods();

        for (Method method : methodsPublic) {
            System.out.println(method.getName());

        }

        for (Method method : methodsPrivate) {
            System.out.println(method.getName());
        }

        APrac aPrac = new APrac();
        aPrac.print();


    }

}
