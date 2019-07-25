package com.javarush.task.task18.task1801;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        File fileMax = new File("D:\\Уроки\\JavaRushTasks\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1801\\Temp");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int minB = Integer.MIN_VALUE;
        int maxB = 0;
        
        while(fileInputStream.available() > 0){
            if ((maxB = fileInputStream.read()) > minB){
                minB = maxB;
            }else maxB = minB;
        }
        fileInputStream.close();
        System.out.println(maxB);
    }
}
