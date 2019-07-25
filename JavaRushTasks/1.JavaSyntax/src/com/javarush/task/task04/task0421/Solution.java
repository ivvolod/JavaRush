package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] nameArray = new String[2];
        for (int i = 0; i < nameArray.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            nameArray[i] = reader.readLine();
        }
        int compareName = nameArray[0].compareTo(nameArray[1]);

        if (compareName == 0){
            System.out.println("Имена идентичны");
        }else if (nameArray[0].length() == nameArray[1].length()){
            System.out.println("Длины имен равны");
        }
//        System.out.println();
    }
}
