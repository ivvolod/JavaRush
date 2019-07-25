package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream console = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();

        System.setOut(console);

        String line = byteArrayOutputStream.toString();
        String[] str = line.split("\\n");

        for (int i = 0; i < str.length; i++) {
            if (i%2 == 0 && i !=0){
                System.out.println("JavaRush - курсы Java онлайн");
                System.out.println(str[i]);
            }else System.out.println(str[i]);

        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
