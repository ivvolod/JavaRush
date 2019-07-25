package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = bufferedReader.readLine();
            FileInputStream fileInputStream = new FileInputStream(fileName);
//            System.out.println(fileInputStream.read());
            System.out.println(SomeMethod(fileInputStream));

            bufferedReader.close();
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static int SomeMethod(FileInputStream fileInputStream) throws IOException {
        int count = 0;
        while (fileInputStream.available() > 0){
            if(fileInputStream.read() == 44){
                count++;
            }
        }
        return count;
    }
}
