package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            TreeMap<String, Double> treeMap = new TreeMap<>();
            String data;
            String keyData;
            Double valueData;
            Double sumValueData;
            int index;
            while (bufferedReader.ready()){
                data = bufferedReader.readLine();
                index = data.indexOf(' ');
                keyData = data.substring(0, index);
                valueData = Double.valueOf(data.substring(index+1));
                if (treeMap.containsKey(keyData)){
                    sumValueData = treeMap.get(keyData) + valueData;
                    treeMap.put(keyData,sumValueData);
                }else treeMap.put(keyData, valueData);

            }
            for (Map.Entry entry: treeMap.entrySet()) {
                if (entry.getValue().equals(Collections.max(treeMap.values()))) System.out.println(entry.getKey() + " ");
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
