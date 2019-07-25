package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String,String> peopleMap = new HashMap<>();
        peopleMap.put(new String("Иванов"), new String("Иван"));
        peopleMap.put(new String("Иванов"), new String("Cергей"));
        peopleMap.put(new String("Петров"), new String("Иван"));
        peopleMap.put(new String("Петров"), new String("Петр"));
        peopleMap.put(new String("Иванов"), new String("Петр"));
        peopleMap.put(new String("Сидоров"), new String("Сергей"));
        peopleMap.put(new String("Сидоров"), new String("Иван"));
        peopleMap.put(new String("Иванов"), new String("Иван"));
        peopleMap.put(new String("Иванов"), new String("Иван"));
        peopleMap.put(new String("Иванов"), new String("Иван"));
//        System.out.println(peopleMap);
        return peopleMap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
