package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            int indexP = list.get(i).indexOf('р');
            int indexL = list.get(i).indexOf('л');
            if (indexL >= 0 && indexP >= 0){
                continue;
            }else if (indexL >= 0){
                list.add(0,list.get(i));
                i++;
            }else if (indexP >= 0){
                list.remove(i);
                i--;
            }
        }

        return list;
    }
}