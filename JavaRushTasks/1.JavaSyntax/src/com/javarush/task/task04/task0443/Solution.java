package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] dataAgeName = new String[4];
        for (int i = 0; i < dataAgeName.length; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            dataAgeName[i] = reader.readLine();
        }
        System.out.println("Меня зовут " + dataAgeName[0] + ".\n" +
                "Я родился " + dataAgeName[3] + "." + dataAgeName[2] + "." + dataAgeName[1]);
    }
}
