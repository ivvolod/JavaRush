package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReaderFileName = new BufferedReader(new InputStreamReader(System.in))) {
            String firstFileName = bufferedReaderFileName.readLine();
            String secondFileName = bufferedReaderFileName.readLine();
            FileReader fileReader = new FileReader(firstFileName);
            FileWriter fileWriter = new FileWriter(secondFileName);
            BufferedReader bufferedReaderFirstFile = new BufferedReader(fileReader);
            BufferedWriter bufferedWriterSecondFile = new BufferedWriter(fileWriter);
            String dataFirstFile;
            Pattern pattern = Pattern.compile("\\.");
            while((dataFirstFile = bufferedReaderFirstFile.readLine()) != null){
                Matcher matcher = pattern.matcher(dataFirstFile);
                dataFirstFile = matcher.replaceAll("!");
                bufferedWriterSecondFile.write(dataFirstFile);
            }
            fileReader.close();
            fileWriter.close();
            bufferedReaderFirstFile.close();
            bufferedWriterSecondFile.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
