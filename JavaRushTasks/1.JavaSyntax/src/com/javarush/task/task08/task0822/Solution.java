package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int readerCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < readerCount; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

//        while (true){
//            String readerString = reader.readLine();
//            if (readerString.equals("")){
//                break;
//            }
//            list.add(Integer.parseInt(readerString));
//
//        }

        return list;
    }
}
