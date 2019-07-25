package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import javax.swing.text.html.parser.Parser;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream start = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        String st = byteArrayOutputStream.toString();

        System.setOut(start);
        String[]strings = st.split(" ");
        Integer firstNumber = Integer.valueOf(strings[0]);
//        System.out.println(firstNumber);
        Integer secondNumber = Integer.valueOf(strings[2]);
//        System.out.println(secondNumber);
        if (strings[1].equals("+")){
            System.out.println(String.format("%d + %d = %d", firstNumber, secondNumber, (firstNumber + secondNumber)));
        }else if (strings[1].equals("-")){
            System.out.println(String.format("%d - %d = %d", firstNumber, secondNumber, (firstNumber - secondNumber)));
        }else if (strings[1].equals("*")){
            System.out.println(String.format("%d * %d = %d", firstNumber, secondNumber, (firstNumber * secondNumber)));
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}


