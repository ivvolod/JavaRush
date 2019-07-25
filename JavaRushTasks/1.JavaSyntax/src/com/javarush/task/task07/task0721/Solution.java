package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        int[] minMax = new int[20];

        for (int i = 0; i < minMax.length; i++) {
            minMax[i] = Integer.parseInt(reader.readLine());
            if (minMax[i] > maximum){
                maximum = minMax[i];
            }
            if (minMax[i] < minimum){
                minimum = minMax[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
