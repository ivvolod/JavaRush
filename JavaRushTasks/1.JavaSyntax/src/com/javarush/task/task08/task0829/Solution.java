package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> addressFamily = new HashMap<>();

        while(true){
            String sity = reader.readLine();
            if (sity.equals("")){
                break;
            }

            String family = reader.readLine();
            addressFamily.put(sity, family);

        }
        String sity = reader.readLine();
        System.out.println(addressFamily.getOrDefault(sity, "None"));






        // List of addresses
//        List<String> addresses = new ArrayList<>();
//        List<String> addresses = Arrays.asList();
//
//
//        while (true) {
//            String family = reader.readLine();
//            if (family.isEmpty()) break;
//
//            addresses.add(family);
//        }
//
//        // Read the house number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < addresses.size()) {
//            String familyName = addresses.get(houseNumber);
//            System.out.println(familyName);
//        }
    }
}
