package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new  FileInputStream(args[0])) {
            int caunt = 0;
            String data;
            while (fileInputStream.available()>0){
                data = String.valueOf(((char)fileInputStream.read()));
                if (data.matches("[a-zA-Z]")) caunt++;
            }

            System.out.println(caunt);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
