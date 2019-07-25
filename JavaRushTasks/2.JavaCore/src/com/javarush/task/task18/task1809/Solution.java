package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        bufferedReader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
        int[] data = new int[fileInputStream.available()];

        while (fileInputStream.available() >0){
            for (int i = (data.length-1); i >= 0; i--) {
                data[i] = fileInputStream.read();

            }
        }
        for (int i = 0; i < data.length; i++) {
            fileOutputStream.write(data[i]);
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
