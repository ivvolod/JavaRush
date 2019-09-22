package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {

        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];
        int textSize = text.length();
        String textRead;
        byte[]bytes = new byte[textSize];

        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
            raf.seek(number);
            raf.read(bytes, 0 , textSize);
            textRead = new String(bytes);
            raf.seek(raf.length());
            if (text.equals(textRead)){
                raf.write("true".getBytes());
            }else raf.write("false".getBytes());
            raf.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
