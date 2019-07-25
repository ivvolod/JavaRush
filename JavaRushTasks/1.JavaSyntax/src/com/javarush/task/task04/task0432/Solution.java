package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] myArray = new String[2];
        for (int i = 0; i < myArray.length; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            myArray[i] = reader.readLine();
        }
        int count = Integer.parseInt(myArray[1]);
        while (count > 0){
            count --;
            System.out.println(myArray[0]);
        }

    }
}
