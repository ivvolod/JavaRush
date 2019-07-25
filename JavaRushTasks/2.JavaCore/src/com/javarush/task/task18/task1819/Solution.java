package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String fileName1;
        String fileName2;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream1 = new FileInputStream(fileName1 = bufferedReader.readLine());
             FileInputStream fileInputStream2 = new FileInputStream(fileName2 = bufferedReader.readLine())
             ){


            int lenData =  fileInputStream1.available()+fileInputStream2.available();
            byte[] data1 = new byte[lenData];
            while (fileInputStream1.available() >0){
                fileInputStream1.read(data1, fileInputStream2.available(), fileInputStream1.available());
            }
            while (fileInputStream2.available()>0){
                fileInputStream2.read(data1);
            }
            FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1);
            for (int i = 0; i < data1.length ; i++) {
                fileOutputStream1.write(data1[i]);
            }
            fileOutputStream1.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
