package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());
        String[] week = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        if (b <= 0 || b >= 8) System.out.println("такого дня недели не существует");
        for (int i = 0; i < week.length; i++) {
            if ((i+1) == b) System.out.println(week[i]);

        }

    }
}