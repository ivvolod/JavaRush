package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        bufferedReader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        Map<Integer,Integer> map = new TreeMap<>();

        while (fileInputStream.available() >0){
            map.put(fileInputStream.read(), 1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey() + " ");
        }

        fileInputStream.close();
    }
}
