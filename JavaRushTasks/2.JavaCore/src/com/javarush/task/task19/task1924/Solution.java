package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0 , "ноль");
        map.put(1 , "один");
        map.put(2 , "два");
        map.put(3 , "три");
        map.put(4 , "четыре");
        map.put(5 , "пять");
        map.put(6 , "шесть");
        map.put(7 , "семь");
        map.put(8 , "восемь");
        map.put(9 , "девять");
        map.put(10 , "десять");
        map.put(11 , "одиннадцать");
        map.put(12 , "двенадцать");
    }
    public static void main(String[] args) {
        try (BufferedReader bufferedReaderNameFile = new BufferedReader(new InputStreamReader(System.in))){
            String nameFile = bufferedReaderNameFile.readLine();
            BufferedReader bufferedReaderDataFile = new BufferedReader(new FileReader(nameFile));
            String dataFile;
//            String dataFileReplace = null;
            String[] dataFileSplit;

//            Pattern pattern = Pattern.compile("\\b\\d+\\b");
//
//            while (bufferedReaderDataFile.ready()){
//                dataFile = bufferedReaderDataFile.readLine();
//                Matcher matcher = pattern.matcher(dataFile);
//                while (matcher.find()){
//                    for (Map.Entry<Integer, String> entry: map.entrySet()) {
//                        String a = matcher.group();
//                        if (a.equals(Integer.toString(entry.getKey()))){
////                            dataFile = dataFile.replaceAll("\\b\\d+\\b", entry.getValue());
//                            dataFile = dataFile.replace(a, entry.getValue());
//                        }
//                    }
//
//                }
//                System.out.println(dataFile);
//
//
//            }




            while (bufferedReaderDataFile.ready()){
                dataFile = bufferedReaderDataFile.readLine();
                dataFileSplit = dataFile.split(" ");
                for (int i = 0; i <dataFileSplit.length ; i++) {
                    for (Map.Entry<Integer, String> entry: map.entrySet()) {
                        if (dataFileSplit[i].equals(Integer.toString(entry.getKey()))){

                            dataFileSplit[i] = entry.getValue();
//                            dataFile = dataFile.replace(dataFileSplit[i], entry.getValue());
                        }
                    }

                    System.out.print(dataFileSplit[i] + " ");
                }


            }

            bufferedReaderDataFile.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
