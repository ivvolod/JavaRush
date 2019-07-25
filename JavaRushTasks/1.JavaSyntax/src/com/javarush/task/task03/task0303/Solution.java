package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(10, 79.0));
        System.out.println(convertEurToUsd(20,78.60));
    }

    public static double convertEurToUsd(int eur, double course) {
        double usd = eur*course;
        return usd;
    }
}
