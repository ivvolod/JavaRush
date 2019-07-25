package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public  static int convertToSeconds(int hour){
        //int second = hour*3600;
        return hour *3600;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(2));
        System.out.println(convertToSeconds(10));
    }
}
