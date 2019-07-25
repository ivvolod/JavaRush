package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true){
            String r = reader.readLine();
            list.add(r);
            if (r.equals("end")){
                list.remove("end");
                break;
            }
        }
        for (String element: list) {
            System.out.println(element);
        }
    }
}