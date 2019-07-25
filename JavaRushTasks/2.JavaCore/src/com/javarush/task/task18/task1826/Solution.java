package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream(args[1]); FileOutputStream fileOutputStream = new FileOutputStream(args[2])){
            int data;
            int dataCod;
            while ((data = fileInputStream.read()) != -1){
                if (args[0].equals("-e")){
                    dataCod = codingData(data);
                    fileOutputStream.write(dataCod);
                }
                if (args[0].equals("-d")){
                    dataCod = encodingData(data);
                    fileOutputStream.write(dataCod);
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static int codingData(int data){

        if (data % 2 == 0){
            data++;
        } else data--;
        return data;
    }
    public static int encodingData(int data){
        if (data % 2 == 0){
            data++;
        } else data--;
        return data;
    }


}
