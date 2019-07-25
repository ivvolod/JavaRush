package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int myNumber = Integer.parseInt(reader.readLine());

        if (myNumber == 0){
            System.out.println("ноль");
        }else if ((myNumber&1) == 0){
            if (myNumber > 0){
                System.out.println("положительное четное число");
            }else System.out.println("отрицательное четное число");
        }else if (myNumber  > 0){
            System.out.println("положительное нечетное число");
        }else System.out.println("отрицательное нечетное число");

//        System.out.println(myNumber >> myNumber);
//        System.out.println((myNumber&1) == 0);


    }
}
