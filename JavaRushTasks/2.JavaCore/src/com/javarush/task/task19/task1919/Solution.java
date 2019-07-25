package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {

        String name;
        int index;
        Double dableValue;
        Double sumValue;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
            TreeMap<String,Double> treeMap = new TreeMap<>();

            while (bufferedReader.ready()){
                String data = bufferedReader.readLine();
                index = data.indexOf(' ');
                name = data.substring(0,index);
                dableValue = Double.valueOf(data.substring(index+1));

                if (treeMap.containsKey(name)){
                    sumValue = treeMap.get(name) + dableValue;
                    treeMap.put(name,sumValue);

                }else treeMap.put(name, dableValue);

            }
            for (Map.Entry item: treeMap.entrySet()) {

                System.out.println(item.getKey() + " " + item.getValue());
            }
        bufferedReader.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
