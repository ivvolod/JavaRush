package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        FileInputStream fileMin = new FileInputStream(fileName);
        int minChar = Integer.MAX_VALUE;
        int data;

        while (fileMin.available() > 0){
            if ((data = fileMin.read()) < minChar){
                minChar = data;
            } else data= minChar;
        }
        fileMin.close();
        System.out.println(minChar);
    }
}
