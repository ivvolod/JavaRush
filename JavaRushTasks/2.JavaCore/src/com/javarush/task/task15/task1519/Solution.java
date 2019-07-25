package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) {
        Pattern patternDouble;
        Pattern patternNumber;

        Matcher matcherDouble;
        Matcher matcherNumber;

        boolean foundDouble;
        boolean foundNumber;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            while (true){
                String number = bufferedReader.readLine();
                patternDouble = Pattern.compile("\\.");
                patternNumber = Pattern.compile("\\d");

                matcherDouble = patternDouble.matcher(number);
                matcherNumber = patternNumber.matcher(number);

                foundDouble = matcherDouble.find();
                foundNumber = matcherNumber.find();

                label:if (!number.equals("exit")){
                    if (foundDouble == true && foundNumber == true){
                        Double doubNumber = Double.parseDouble(number);
                        print(doubNumber);
                        break label;
                    }if (foundNumber == true){
                        int intNumber = Integer.parseInt(number);
                        if (intNumber > 0 && intNumber < 128) {
                            short shortNumber = (short) intNumber;
                            print(shortNumber);
                            break label;
                        }
                        if (intNumber <= 0 || intNumber >= 128){
                            print(intNumber);
                            break label;
                        }
                    }else print(number);


                }
                else break;

            }



        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
