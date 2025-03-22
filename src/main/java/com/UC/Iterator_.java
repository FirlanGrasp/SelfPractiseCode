package com.UC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_ {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator = list.iterator();
        while(iterator.hasNext()){
            String temp = iterator.next();
            if(temp.equals("C")){
                iterator.remove();
                continue;
            }
            System.out.println(temp);
        }
    }
}
