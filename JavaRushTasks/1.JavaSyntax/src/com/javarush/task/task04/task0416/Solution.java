package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Float deltaTime  = Float.valueOf(reader.readLine());
        deltaTime = deltaTime % 5;
        if (deltaTime >= 0 && deltaTime < 3){
            System.out.println("зелёный");
        }else if (deltaTime >= 3 && deltaTime < 4){
            System.out.println("жёлтый");
        }else  if (deltaTime >= 4 && deltaTime < 5)
            System.out.println("красный");
//        System.out.println(5%10);
    }
}