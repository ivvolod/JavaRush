package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> set = new HashMap<>();
        set.put("Markiz1", new Cat("Markiz1"));
        set.put("Markiz2", new Cat("Markiz2"));
        set.put("Markiz3", new Cat("Markiz3"));
        set.put("Markiz4", new Cat("Markiz4"));
        set.put("Markiz5", new Cat("Markiz5"));
        set.put("Markiz6", new Cat("Markiz6"));
        set.put("Markiz7", new Cat("Markiz7"));
        set.put("Markiz8", new Cat("Markiz8"));
        set.put("Markiz9", new Cat("Markiz9"));
        set.put("Markiz10", new Cat("Markiz10"));
        return  set;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>();
        cats.addAll(map.values());
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
