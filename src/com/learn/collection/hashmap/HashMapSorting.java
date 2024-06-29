package com.learn.collection.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashMapSorting {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Hii",20);
        map.put("Hello",202);
        map.put("Kumar",19);
        map.put("Kanha",12);
        map.put("Kumaru",10);
        map.put("Kumari",20);
        System.out.println(map);
//        Map<String,Integer> sortedMap =
//                map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
//                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2, LinkedHashMap::new));
//        //System.out.println(sortedMap);
//        sortedMap.forEach((k,v)->System.out.println(k+" - "+v));

        Map<String,Integer> sMap = map.entrySet().stream()
                                    .sorted(Map.Entry.comparingByValue((o1,o2)->o2-o1))
                                    .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,Integer::max, TreeMap::new));

        sMap.forEach((k,v)->System.out.println(k+" "+v));

    }
}
