package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int min = Integer.MAX_VALUE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            list.add(reader.readLine());
            min = Math.min(min, list.get(i).length());
        }
        for (int i = 0; i < list.size(); i++) {
            int size = list.get(i).length();
            if (size == min) System.out.println(list.get(i));
        }
    }
}
