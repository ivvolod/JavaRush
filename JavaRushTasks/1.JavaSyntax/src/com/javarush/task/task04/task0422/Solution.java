package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] namePlusAge = new String[2];
        for (int i = 0; i < namePlusAge.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            namePlusAge[i] = reader.readLine();

        }
//        System.out.println(namePlusAge[0] + namePlusAge[1]);

        if (Integer.parseInt(namePlusAge[1]) < 18) System.out.println("Подрасти еще");
    }
}
