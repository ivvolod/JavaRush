package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
//        char[] chars = new char[10];

    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfStringList = new ArrayList[3];
        for (int i = 0; i < arrayOfStringList.length ; i++) {
            arrayOfStringList[i] = new ArrayList<>();
            arrayOfStringList[i].add("Я");
        }


//        arrayOfStringList[1] = new ArrayList<String>(1);

//        arrayOfStringList[1] = new ArrayList<>();
//        arrayOfStringList[1].add("люблю");
//        arrayOfStringList[1] = new ArrayList<>();
//        arrayOfStringList[1].add("Java");



//        ArrayList<String> [] arrayList = new ArrayList[]{new ArrayList<String>(),new ArrayList<String>(),new ArrayList<String>()};
//        new ArrayList<String>().add("Я");
//        new ArrayList<String>().add("люблю");
//        new ArrayList<String>().add("Java");

//        arrayList.add("люблю");
//        arrayList.add("JAVA");

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}