package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        String longString = null;
        Solution.strings = new ArrayList<String>(5);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sizeMax = Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++){
            Solution.strings.add(reader.readLine());
            sizeMax = Math.max(sizeMax,Solution.strings.get(i).length());

        }

        for(int i = 0; i < Solution.strings.size(); i++){
            int size  = Solution.strings.get(i).length();
            if (size == sizeMax){
                longString = Solution.strings.get(i);
                System.out.println(longString);
            }
        }

    }
}
