package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mySortArray = new int[5];
        for (int i = 0; i <mySortArray.length ; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            mySortArray[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(mySortArray);
        for (int element:mySortArray) {
            System.out.println(element);
        }



    }
}
