package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        String res =null;
        if (n < 0){
            res = "0";
        }else if (n==0){
        res = "1";

        }else  if (n <=150) {
            BigInteger factor = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                factor = factor.multiply(BigInteger.valueOf(i));
                res = String.valueOf(factor);
            }
        }



        return res;
    }
}
