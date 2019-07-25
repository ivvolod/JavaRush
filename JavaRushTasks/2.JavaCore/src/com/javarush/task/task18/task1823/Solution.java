package com.javarush.task.task18.task1823;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName;

            while (true){

                fileName = bufferedReader.readLine();
                if (fileName.equals("exit")) break;
                new ReadThread(fileName).start();


            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
            //implement constructor body
        }

        @Override
        public void run() {
            try(FileInputStream fileInputStream = new FileInputStream(fileName)) {

                int symbol;
                HashMap<Integer, Integer> map = new HashMap<>();

                while ((symbol = fileInputStream.read()) != -1){
                    if (map.containsKey(symbol) == true){
                        map.put(symbol, map.get(symbol)+1);
                    }else {
                        map.put(symbol, 1);
                    }

                }
                int maxValueMap = Collections.max(map.values());
                for (Map.Entry<Integer, Integer> maxItem: map.entrySet()) {
                    if (maxItem.getValue() == maxValueMap){
                        resultMap.put(fileName,maxItem.getKey());
                    }
                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
