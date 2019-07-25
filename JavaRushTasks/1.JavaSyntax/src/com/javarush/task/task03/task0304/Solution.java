package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double  addPercent = i + (i*0.1);
        return addPercent;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
