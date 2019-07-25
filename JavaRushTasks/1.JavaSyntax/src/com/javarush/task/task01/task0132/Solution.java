package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        int[] myArr = new int[3];
        int sum =0;
        for (int i = 0; i < 3; i++) {
            myArr[i] = number % 10;
            number /=10;
            //System.out.println(myArr[i]);
        }
        for (int i = 0; i < 3; i++) {
            sum += myArr[i];

        }
        return sum;
    }
}