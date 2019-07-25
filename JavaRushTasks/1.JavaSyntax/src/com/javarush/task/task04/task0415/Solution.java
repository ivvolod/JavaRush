package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] myArr = new int [3];
        for (int i = 0; i < myArr.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            myArr[i] = Integer.parseInt(reader.readLine());
        }
        if (((myArr[0] + myArr[1]) > myArr[2]) && ((myArr[1] + myArr[2]) > myArr[0]) && ((myArr[0] + myArr[2]) > myArr[1])){
            System.out.println("Треугольник существует.");
        } else System.out.println("Треугольник не существует.");
    }
}