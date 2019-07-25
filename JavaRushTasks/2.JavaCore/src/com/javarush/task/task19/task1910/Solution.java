package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReaderFileName = new BufferedReader(new InputStreamReader(System.in))) {
            String firstFileName = bufferedReaderFileName.readLine();
            String secondFileName = bufferedReaderFileName.readLine();
            FileReader fileReaderFirstFile = new FileReader(firstFileName);
            FileWriter fileWriterSecondFile = new FileWriter(secondFileName);
            BufferedReader bufferedReaderFirstFile = new BufferedReader(fileReaderFirstFile);
            String dataFirstFile;
            Pattern pattern = Pattern.compile("\\p{Punct}|\\n");
            BufferedWriter bufferedWriterSecondFile = new BufferedWriter(fileWriterSecondFile);
            while((dataFirstFile = bufferedReaderFirstFile.readLine()) != null){
                Matcher matcher = pattern.matcher(dataFirstFile);
                dataFirstFile = matcher.replaceAll("");
                bufferedWriterSecondFile.write(dataFirstFile);

            }
            fileReaderFirstFile.close();
            fileWriterSecondFile.close();
            bufferedReaderFirstFile.close();
            bufferedWriterSecondFile.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
