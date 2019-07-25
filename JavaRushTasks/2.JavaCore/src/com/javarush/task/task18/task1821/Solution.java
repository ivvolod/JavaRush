package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader(args[0])) {

            int file;
            Map<Integer, Integer> map = new TreeMap<>();

            while ((file = fileReader.read()) != -1){
                    if (map.containsKey(file) == true){
                        map.put(file, map.get(file)+1);
                    }else {
                        map.put(file, 1);
                    }

            }
            for(Map.Entry<Integer, Integer> item : map.entrySet()){
                int key = item.getKey();

                System.out.println(((char) key) + " " + item.getValue());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
