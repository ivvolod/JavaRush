package com.javarush.task.task20.task2028;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> list = new CustomTree();

        for (int i = 1; i < 16; i++) {
            list.add(String.valueOf(i));
        }

        System.out.println("The list size is " + list.size());
        System.out.println("The expected parent is 3. The actual parent is " + ((CustomTree) list).getParent("8"));
//        System.out.println("The expected parent is 3. The actual parent is " + ((CustomTree) list).getParent("15"));
//        System.out.println("The expected parent is 3. The actual parent is " + ((CustomTree) list).getParent("5"));
        System.out.println("The expected parent is null. The actual parent is " + ((CustomTree) list).getParent("20"));

//
        list.remove("3");
//        System.out.println("The list size is remove 3 node " + list.size());

        System.out.println("The expected parent is null. The actual parent is " + ((CustomTree) list).getParent("8"));
//////
        list.add("16");
//        System.out.println("The list size is  add 16 node " + list.size());

        System.out.println("The expected parent is 9. The actual parent is " + ((CustomTree) list).getParent("16"));

        list.remove("4");
//        System.out.println("The list size is  remove 4 node " + list.size());

        list.remove("5");
//        System.out.println("The list size is remove 5 node " + list.size());

        list.remove("6");
//        System.out.println("The list size is remove 6 node " + list.size());

        System.out.println("Expected: true. Actual: " + list.add("20"));
//        System.out.println("The list size is 20 node " + list.size());
        System.out.println("The expected parent is 1. The actual parent is " + ((CustomTree) list).getParent("20"));

//        System.out.println("Expected: true. Actual: " + list.add("21"));
////        System.out.println("The list size is 20 node " + list.size());
//        System.out.println("The expected parent is 1. The actual parent is " + ((CustomTree) list).getParent("21"));
//
//        System.out.println("Expected: true. Actual: " + list.add("22"));
//        System.out.println("The list size is 20 node " + list.size());
//        System.out.println("The expected parent is 2. The actual parent is " + ((CustomTree) list).getParent("22"));
    }
}
