package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

/* 
Генератор паролей
*/
/**
 * @author vladimir
 */

public class Solution {

    public static final String LOWER_ALPHABETS = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPER_ALPHABETS = LOWER_ALPHABETS.toUpperCase();
    public static final String NUMBER = "0123456789";
    public static final String ALPHABETS_NUMBER = LOWER_ALPHABETS + UPPER_ALPHABETS + NUMBER;
    public static final int LENGTH_PASSWORD = 8;




    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Random rand = new Random();
        byte[] result = new byte[LENGTH_PASSWORD];
        for (int i = 0; i < LENGTH_PASSWORD; i++) {
            result[i] = (byte) ALPHABETS_NUMBER.charAt(rand.nextInt(ALPHABETS_NUMBER.length()));
        }
        try {
            baos.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return baos;
    }
}