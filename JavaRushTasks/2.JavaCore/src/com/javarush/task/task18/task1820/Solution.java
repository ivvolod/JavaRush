package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName1 = bufferedReader.readLine();
            String fileName2 = bufferedReader.readLine();
            bufferedReader.close();

            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1));
            String  dataFile1 = bufferedReader1.readLine();
            bufferedReader1.close();

            String[] dataRaw = dataFile1.split(" ");
//            dataRaw.toString();

            int dataReady;
            FileWriter fileWriter = new FileWriter(fileName2);

            for (int i = 0; i <dataRaw.length; i++) {
                dataReady = Math.round(Float.valueOf(dataRaw[i]));
//                System.out.println(dataReady);
                fileWriter.write(dataReady + " ");
            }


            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
