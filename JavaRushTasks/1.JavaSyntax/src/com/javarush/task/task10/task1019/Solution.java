package com.javarush.task.task10.task1019;



import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<>();

        while (true) {
            String c = reader.readLine();
            if (c.isEmpty()) {
                break;
            }else {
                int id = Integer.parseInt(c);
                String name = reader.readLine();

                hashMap.put(name, id);
            }


        }
//        while(true){
//            try{
//                int id = Integer.parseInt(reader.readLine());
//                String name = reader.readLine();
//
//                hashMap.put(name, id);
//            }catch (NumberFormatException e) {
//                break;
//            }
//
//        }
        for (Map.Entry<String,Integer> element : hashMap.entrySet()) {
            System.out.println( element.getValue() + " " + element.getKey());
        }


    }
}
