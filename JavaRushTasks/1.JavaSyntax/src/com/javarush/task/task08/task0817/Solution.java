package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String,String>();
        map.put("Stallone", "June");
        map.put("Vagonne", "August");
        map.put("Malonne", "June");
        map.put("Brugbonne", "January");
        map.put("Liptonne", "December");
        map.put("Makaronne", "June");
        map.put("Markaponne", "September");
        map.put("Sillikonne", "June");
        map.put("Titikonne", "July");
        map.put("Molokonne", "June");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String,String> map) {
        ArrayList<String> list = new ArrayList<>(map.values());
        for (String element: list) {
            if (Collections.frequency(list, element) > 1){
                removeItemFromMapByValue(map, element);
            }
        }


    }

    public static void removeItemFromMapByValue(Map<String,String> map, String value) {
        HashMap<String, String> copy = new HashMap<String,String>(map);

        for (Map.Entry<String,String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
