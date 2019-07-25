package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                 FileOutputStream fileOutputStream1 = new FileOutputStream(bufferedReader.readLine());
                 FileInputStream fileInputStream2 = new FileInputStream(bufferedReader.readLine());
                 FileInputStream fileInputStream3 = new FileInputStream(bufferedReader.readLine())){

                byte[] data1 = new byte[fileInputStream2.available()];

                while (fileInputStream2.available()>0){
                    fileInputStream2.read(data1);
                    fileOutputStream1.write(data1);
                }
//                fileOutputStream1.toString();
                byte[] data2 = new byte[fileInputStream3.available()];
//                int len = fileInputStream3.available();
                while (fileInputStream3.available() >0){
                    fileInputStream3.read(data2);
                    fileOutputStream1.write(data2);
                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
