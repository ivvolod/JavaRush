package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] myArray = new int[3];
        int countPositive =0;
        for (int i = 0; i < myArray.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            myArray[i] = Integer.parseInt(reader.readLine());
//            int countPositive =0;
            if (myArray[i] >0){
                countPositive ++;
            }

        }System.out.println(countPositive);


    }
}
