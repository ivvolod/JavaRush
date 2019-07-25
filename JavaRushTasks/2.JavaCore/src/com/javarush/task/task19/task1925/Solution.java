package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReaderFile = new BufferedReader(new FileReader(args[0]))) {
            String dataFile;
            StringBuffer stringBuffer = new StringBuffer();
            Pattern pattern = Pattern.compile("[\\S]{7,}");
            while (bufferedReaderFile.ready()){
                dataFile = bufferedReaderFile.readLine();
                Matcher matcher = pattern.matcher(dataFile);

                while (matcher.find()){
                    stringBuffer.append(matcher.group() + ",");

                }

            }
            FileWriter fileWriter = new FileWriter(args[1]);
            fileWriter.write(String.valueOf(stringBuffer.substring(0, stringBuffer.length()-1)));
            fileWriter.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
