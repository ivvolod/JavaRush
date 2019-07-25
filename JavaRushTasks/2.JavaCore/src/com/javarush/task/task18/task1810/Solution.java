package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            while(true) {
                String fileName = bufferedReader.readLine();

//        addData(fileName, 1001);

                FileInputStream fileInputStream = new FileInputStream(fileName);
                if (fileInputStream.available() < 1000){
                    fileInputStream.close();
                    throw new DownloadException();
                }
                if (fileName.isEmpty() == true) break;
            }


        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static class DownloadException extends Exception {

    }
//    public static void addData(String fileName, int length) throws IOException {
//
//        int[] data = new int[length];
//        for (int i = 0; i < length; i++) {
//            data[i] = i;
//        }
//        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
//        for (int i = 0; i < length; i++) {
//            fileOutputStream.write(data[i]);
//        }
//    }
}
