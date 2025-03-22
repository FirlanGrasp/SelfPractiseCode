package com.UC;

import java.util.*;

public class CollectionMap {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(6);

        System.out.println(list);

        list.set(0,0);
        System.out.println(list.get(0));

        list.remove(0);
        System.out.println(list.get(0));

        System.out.println(list.contains(0));
        System.out.println(list.contains(6));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.clear();
        System.out.println(list);

        System.out.println("-----Map------");

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        System.out.println(map);

        map.put("a" , 9);
        System.out.println(map.get("a"));

        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue(2));
        System.out.println(map.isEmpty());

        map.clear();
        System.out.println(map);
        System.out.println("-----Set------");

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("a");
        System.out.println(set);


    }


}
