package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileNamePart;
            String fileName = null;
            TreeSet<String> treeSet = new TreeSet<>();
            while (true){
                fileNamePart = bufferedReader.readLine();
                if(fileNamePart.equals("end")) break;
                treeSet.add(fileNamePart);
                fileName = fileNamePart.split("\\.part")[0];
            }
            
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName));

            for (String item:treeSet) {
                FileInputStream fileInputStream = new FileInputStream(item);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//                byte[] fileData = new byte[fileInputStream.available()];
                while (bufferedInputStream.available() >0){
                    bufferedOutputStream.write(bufferedInputStream.read());
                }
                fileInputStream.close();
                bufferedInputStream.close();
//                bufferedOutputStream.close();

            }
            bufferedOutputStream.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
