package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = bufferedReader.readLine();
            String textRow = String.format("%n%-8d%-30s%-8s%-4s", parseId(fileName), args[1], args[2], args[3]);
            FileWriter fileWriter = new FileWriter(fileName, true);
            if (args[0].equals("-c")){
                fileWriter.write(textRow);
            }

            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Integer parseId(String fileName){
        Integer lastItemId = 0;
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))){
            while (bufferedReader.ready()){
                String str = bufferedReader.readLine();
                Pattern pattern = Pattern.compile("(^\\d+)");
                Matcher matcher = pattern.matcher(str);
                matcher.find();

                treeMap.put(Integer.valueOf(matcher.group()), str);
            }
            Map.Entry<Integer, String> lastItem = treeMap.lastEntry();
            lastItemId = lastItem.getKey() + 1;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return lastItemId;
    }

}
