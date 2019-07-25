package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int data;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        Map<Integer,Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0){
            data = fileInputStream.read();
            if (map.containsKey(data)){
                map.put(data, map.get(data)+1);

            } else map.put(data, 1);
        }
        bufferedReader.close();
        fileInputStream.close();

        Solution.toString(map);



    }
    public static void toString(Map<Integer,Integer> map){
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1) System.out.print(entry.getKey() + " ");
        }
    }
}
