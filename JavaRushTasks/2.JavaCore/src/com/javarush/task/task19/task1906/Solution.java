package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileIn = bufferedReader.readLine();
            String fileOut = bufferedReader.readLine();
            FileReader fileReader = new FileReader(fileIn);
            FileWriter fileWriter = new FileWriter(fileOut);

            while (fileReader.ready()){
                fileReader.read();
                fileWriter.write(fileReader.read());
            }
            fileReader.close();
            fileWriter.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
