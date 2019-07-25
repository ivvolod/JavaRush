package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] myArray = new int[3];
        for (int i = 0; i < myArray.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            myArray[i] = Integer.parseInt(reader.readLine());
        }
        if (myArray[0] != myArray[1]){
            if (myArray[0] != myArray[2]){
                System.out.println("1");
            }else if (myArray[0] != myArray[2]){
                
            }
        }
    }
}
