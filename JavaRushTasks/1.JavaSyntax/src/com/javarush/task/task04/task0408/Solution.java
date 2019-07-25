package com.javarush.task.task04.task0408;

/* 
Хорошо или плохо?
*/

public class Solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        String compare;
        if (a < 5){
            compare = "Число меньше 5";
        }else if (a > 5) {
            compare = "Число больше 5";
        }else compare = "Число равно 5";
        System.out.println(compare);
    }
}