package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char [] chars = reader.readLine().toCharArray();
        char[] charG = new char[chars.length];
        char[] charSS = new char[chars.length];


        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])==true){
                charG[i] = chars[i];

            }else if (chars[i] != ' ') {
                charSS[i]= chars[i];
            }
        }
        for (char element:charG) {
           if (element != '\u0000'){
               System.out.print(element + " ");
           }

        }
        System.out.println();
        for (char element:charSS) {
            if (element != '\u0000'){
                System.out.print(element + " ");
            }

        }


    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}