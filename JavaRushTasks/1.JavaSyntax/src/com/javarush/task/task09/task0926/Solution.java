package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        int[] arrays5 = {1,2,3,4,5};
        int[] arrays2 = {6,7};
        int[] arrays4 = {8,9,10,11};
        int[] arrays7 = {11,12,13,14,15,16,17};
        int[] arrays0 = {};

        ArrayList <int[]> arrayList = new ArrayList<>();
        arrayList.add(arrays5);
        arrayList.add(arrays2);
        arrayList.add(arrays4);
        arrayList.add(arrays7);
        arrayList.add(arrays0);

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
