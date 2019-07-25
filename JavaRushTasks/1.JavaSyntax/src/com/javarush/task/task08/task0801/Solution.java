package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> heshSet = new HashSet<>();
        heshSet.add("арбуз");
        heshSet.add("банан");
        heshSet.add("вишня");
        heshSet.add("груша");
        heshSet.add("дыня");
        heshSet.add("ежевика");
        heshSet.add("женьшень");
        heshSet.add("земляника");
        heshSet.add("ирис");
        heshSet.add("картофель");
        for ( String element: heshSet) {
            System.out.println(element);
        }

    }
}
