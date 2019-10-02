package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Генератор паролей
*/
public class Solution {


    public static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPER = LOWER.toUpperCase();
    public static final String NUMBER = "0123456789";
    public static final String ALPHABET_NUMBER = LOWER + UPPER + NUMBER;
    public static final int LENGTH_PASSWORD = 8;
    public static Random random;
    public static byte[] result;
    public static String pattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]))";
    public static Pattern pat;
    public static Matcher matcher;
    public static ByteArrayOutputStream baos;



    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        baos = new ByteArrayOutputStream();
        random = new Random();
        result = new byte[LENGTH_PASSWORD];
        pat = Pattern.compile(pattern);


        do {
            for (int i = 0; i < LENGTH_PASSWORD; i++) {
                result[i] = (byte) ALPHABET_NUMBER.charAt(random.nextInt(ALPHABET_NUMBER.length()));

            }
            matcher = pat.matcher(new String(result));

        }while (!matcher.find());

        try {
            baos.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return baos;
    }
}