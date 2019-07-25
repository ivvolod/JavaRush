package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        try(BufferedReader bufferedReaderName = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = bufferedReaderName.readLine();
            String line;
            BufferedReader bufferedReaderFileData = new BufferedReader(new FileReader(fileName));
            while (bufferedReaderFileData.ready()){
                line = bufferedReaderFileData.readLine();
                String[] dataArray = line.split(" ");
                int count = 0;

                for (int i = 0; i < dataArray.length; i++) {
                    for (int j = 0; j < words.size(); j++) {
                        if(dataArray[i].equals(words.get(j))) count++;

                    }

                }
                if (count == 2) System.out.println(line);

            }
            bufferedReaderFileData.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
