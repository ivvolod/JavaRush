package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String  myNubber =  reader.readLine();
        int length = myNubber.length();
        int numberInteger = Integer.parseInt(myNubber);

        switch (length){
            case 1:
                myNubber = ((numberInteger&1) == 0)? "четное однозначное число" : "нечетное однозначное число";
            break;
            case 2:
                myNubber = ((numberInteger&1) == 0)? "четное двузначное число" : "нечетное двузначное число";
            break;
            case 3:
                myNubber = ((numberInteger&1) == 0)? "четное трехзначное число" : "нечетное трехзначное число";
        }
        if (numberInteger >=1 && numberInteger <=999) System.out.println(myNubber);



    }
}
