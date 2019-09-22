package com.javarush.task.task32.task3201;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) {
        String fileName = args[0];
        int numberSeek = Integer.parseInt(args[1]);
        String text = args[2];
//        File file = new File(fileName);
//        long fileLength = file.length();
        long fileLength;

        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
            fileLength = raf.length();
            if (fileLength < numberSeek){
                raf.seek(fileLength);
//                raf.writeBytes(text);
                raf.write(text.getBytes());

            }else {
                raf.seek(numberSeek);
//                raf.writeBytes(text);
                raf.write(text.getBytes());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
