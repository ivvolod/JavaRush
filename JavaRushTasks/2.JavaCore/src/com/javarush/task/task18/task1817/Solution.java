package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(args[0])){
            int symbolLengs = fileInputStream.available();
            float count = 0;
            String symbolCounterSpacer;
            while (fileInputStream.available()>0){
                symbolCounterSpacer = String.valueOf(((char) fileInputStream.read()));
                if (symbolCounterSpacer.matches(" ")) count++;

            }
            float roundOff = count/symbolLengs * 100;
//            System.out.println(roundOff);

            System.out.println(Math.round(roundOff * 100) / 100.f);

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
