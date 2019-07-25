package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        Map<Integer, Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0){

            int data = fileInputStream.read();

// Key - data(fileInputStream); value - repeat count
            if (map.containsKey(data)){
                map.put(data, map.get(data)+1);
            } else map.put(data, 1);

        }
        bufferedReader.close();
        fileInputStream.close();

        Solution.CaunterMaxValue(map);
        Solution.toString(map);
//        System.out.println(counterMax);
//        for (Map.Entry<Integer,Integer> item : map.entrySet()){
//            System.out.print(item.getKey()+ " " + item.getValue() + " ; ");
//        }

    }
    static int counterMax = 0;

    public static int CaunterMaxValue(Map<Integer, Integer> map){
        for (Map.Entry<Integer,Integer> item : map.entrySet()){
            int itemMaxValue = item.getValue();
            if(itemMaxValue > counterMax) counterMax = itemMaxValue;
        }
        return counterMax;
    }

    public static void toString(Map<Integer, Integer> map) {
        for (Map.Entry<Integer,Integer> item : map.entrySet()){
            int itemMaxValue = item.getValue();
            if(itemMaxValue >= counterMax) System.out.print(item.getKey() + " ");
        }
    }
}
