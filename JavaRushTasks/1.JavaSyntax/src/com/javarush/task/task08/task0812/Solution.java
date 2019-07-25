package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < 10 ; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {

                if (list.get(i).equals(list.get(j)) == true){
                    count++;
                } else count = 1;
                if (count > max) {
                    max = count;
                }else count = 0;
            }

        }

        System.out.println(max);


    }
}