package com.javarush.task.task11.task1123;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int dataMax = Integer.MAX_VALUE;
        int dataMin = Integer.MIN_VALUE;
        Integer x = 0;
        Integer y = 0;

        for (int i = 0; i < inputArray.length ; i++) {
            for (int j = 0; j <inputArray.length; j++) {
                if (inputArray[i] > dataMin ){
                    y = inputArray[i];
                    dataMin = inputArray[i];
                }
            }
        }
        for (int i = 0; i < inputArray.length ; i++) {
            for (int j = 0; j <inputArray.length; j++) {
                if (inputArray[i] < dataMax ){
                    x = inputArray[i];
                    dataMax = inputArray[i];
                }
            }
        }


        return new Pair<Integer, Integer>(x, y);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
