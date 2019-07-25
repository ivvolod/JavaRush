package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] myArr = new int[3];
        for (int i = 0; i <myArr.length ; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(reader.readLine());
            myArr[i] = count;
        }
        if (myArr[0] == myArr[1]){
            System.out.print(myArr[0] + " " + myArr[1]);
            if (myArr[1] == myArr[2]){
                System.out.print(" " + myArr[2]);
            }else System.out.print("");
        }else if (myArr[1] == myArr[2]){
            System.out.print(myArr[1] + " " + myArr[2]);
        }else if (myArr[0] == myArr[2]) {
            System.out.print(myArr[0] +" " + myArr[2]);
        }else System.out.print("");
    }
}