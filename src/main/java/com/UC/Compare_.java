package com.UC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare_ {

    class Person implements Comparable<Person>{
        int age;
        String name;

        Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString(){
            return name + " " + age;
        }

        @Override
        public int compareTo(Person one){
            return Integer.compare(one.age,this.age);
        }

    }

    static class comP implements Comparator<Person> {
        @Override
        public int compare(Person one, Person two){
            return Integer.compare(one.age, two.age);
        }
    }

    public static void main(String[] args) {
        Compare_ c = new Compare_();
        Compare_.Person one = c.new Person(100,"Tom");
        Compare_.Person two = c.new Person(2,"Tom");
        List<Person> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        Collections.sort(list, new Compare_.comP());
        System.out.println(list);
        Compare_.Person three = c.new Person(3,"Tom");
        list.add(three);
        Collections.sort(list, Comparator.comparingInt((Person a) -> a.age));
        System.out.println(list);

        Compare_.Person four = c.new Person(7,"Tom");
        list.add(four);
        Collections.sort(list);
        System.out.println(list);
    }
}
