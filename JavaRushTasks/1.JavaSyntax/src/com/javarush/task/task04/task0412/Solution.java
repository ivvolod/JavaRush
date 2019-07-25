package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int b = Integer.parseInt(reader.readLine());
        System.out.println((b >= 0)? b*2 : b + 1);

    }

}