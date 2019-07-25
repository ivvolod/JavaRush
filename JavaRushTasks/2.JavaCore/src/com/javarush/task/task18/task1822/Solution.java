package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){

            String fileName = bufferedReader.readLine();

            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

            boolean dataRead;

            while ((dataRead = bufferedReader1.ready()) == true){
                String data = bufferedReader1.readLine();
                Pattern pattern = Pattern.compile("^\\d+");
                Matcher match = pattern.matcher(data);
                while (match.find()){
//                    System.out.println(match.group());
                    if (match.group().equals(args[0])){
                        System.out.println(data);
                    }

                }

            }
            bufferedReader1.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
