package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReaderFileName = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = bufferedReaderFileName.readLine();
            BufferedReader bufferedReaderFileData = new BufferedReader(new FileReader(fileName));
            StringBuffer stringBuffer;
            while (bufferedReaderFileData.ready()){
                stringBuffer =  new StringBuffer(bufferedReaderFileData.readLine());
                System.out.println(stringBuffer.reverse().toString());

            }
            bufferedReaderFileData.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
