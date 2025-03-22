package com.UC;

import java.util.*;

public class Collect {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.remove(0);
        list.set(0,1);
        list.add(0,3);
        list.remove(Integer.valueOf(3));
        System.out.println(list);
        System.out.println(list.size());

        Map<String,Integer> map = new HashMap<>();

        map.put("p",1);
        System.out.println(map.get("p"));
        System.out.println(map.containsKey("p"));

        System.out.println(map.getOrDefault("f",0));
        System.out.println(map.size());

        Set<Integer> set = new HashSet<>();
        set.add((8));

        set.add(9);
        set.remove(9);
        System.out.println(set);


        Deque<Integer> queue = new LinkedList<>();

        queue.push(0);
        queue.push(8);
        System.out.println(queue.pop());
        System.out.println(queue.pollLast());






    }
}
