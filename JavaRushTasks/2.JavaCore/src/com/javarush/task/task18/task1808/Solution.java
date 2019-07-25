package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        String fileName3 = bufferedReader.readLine();
        bufferedReader.close();

        FileInputStream fileInputStreamFile1 = new FileInputStream(fileName1);
        byte[] dataFile = new byte[fileInputStreamFile1.available()];
        FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);
        FileOutputStream fileOutputStream3 = new FileOutputStream(fileName3);

        if (fileInputStreamFile1.available() > 0){

            int count = fileInputStreamFile1.read(dataFile);
            fileOutputStream2.write(dataFile, 0, countSizeBuff(count));
            fileOutputStream3.write(dataFile,countSizeBuff(count), dataFile.length-countSizeBuff(count));
//            fileOutputStream2.write(dataFile, 0, 5);
//            fileOutputStream3.write(dataFile,5, 4);
//            fileOutputStream3.write();

        }
        fileInputStreamFile1.close();
        fileOutputStream2.close();
        fileOutputStream3.close();


    }
    public static int countSizeBuff(int count){
        if (count % 2 == 0) return count/2;
        return (count/2)+1;
    }

}
