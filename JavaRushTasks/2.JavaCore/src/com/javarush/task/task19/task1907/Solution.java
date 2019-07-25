package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = bufferedReader.readLine();
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReaderFile = new BufferedReader(fileReader);
            String data;
            Pattern pattern = Pattern.compile("\\bworld\\b");
            int count = 0;
            while ((data = bufferedReaderFile.readLine()) != null){
                Matcher matcher = pattern.matcher(data);
                while (matcher.find()){
                    count++;
                }
            }

            System.out.println(count);
            fileReader.close();
            bufferedReaderFile.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
