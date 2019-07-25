package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] myArray = new int[3];
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < myArray.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            myArray[i] = Integer.parseInt(reader.readLine());

            if (myArray[i] > 0){
                countPositive ++;
            }else if (myArray[i] < 0){
                countNegative ++;
            }

        }
        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);

    }
}
