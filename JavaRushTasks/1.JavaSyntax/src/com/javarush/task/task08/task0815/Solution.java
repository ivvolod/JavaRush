package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Иванов", "Иван");
        hashMap.put("Патрушев", "Петр");
        hashMap.put("Иванников", "Олег");
        hashMap.put("Петрушка", "Иван");
        hashMap.put("Сидоров", "Иван");
        hashMap.put("Смолянов", "Федор");
        hashMap.put("Кулибин", "Коба");
        hashMap.put("Воснецов", "Иван");
        hashMap.put("Туманов", "Петр");
        hashMap.put("Петров", "Владимир");
        return hashMap;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int frequency = 0;
        for (String value: map.values()){
            if (value.equals(name)){
                frequency++;
            }
        }
        return frequency;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int frequency = 0;
        for (String key : map.keySet()){
            if (key.equals(lastName)){
                frequency++;
            }
        }
        return frequency;

    }

    public static void main(String[] args) {
//        System.out.println(getCountTheSameFirstName(createMap(), "Иван"));
//        System.out.println(getCountTheSameLastName(createMap(), "Иванников"));
    }
}
