package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] namePlusAge = new String[2];
        for (int i = 0; i < namePlusAge.length ; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            namePlusAge[i] = reader.readLine();
        }
     //   System.out.println(Integer.parseInt(namePlusAge[1]));
        if (Integer.parseInt(namePlusAge[1]) > 20) System.out.println( "И 18-ти достаточно");
    }
}
