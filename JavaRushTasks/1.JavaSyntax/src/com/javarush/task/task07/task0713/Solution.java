package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> garbage = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%3 == 0 && list.get(i)%2 == 0){
                first.add(list.get(i));
                second.add(list.get(i));
            }else if (list.get(i)%3 == 0){
                first.add(list.get(i));
            }else if (list.get(i)%2 == 0) {
                second.add(list.get(i));
            }else garbage.add(list.get(i));
        }
        printList(first);
        printList(second);
        printList(garbage);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
