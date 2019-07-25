package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = bufferedReader.readLine();
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            PrintStream start = System.out;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(byteArrayOutputStream);
            System.setOut(printStream);

            testString.printSomething();
            byte[] out = byteArrayOutputStream.toByteArray();
            System.setOut(start);
            fileOutputStream.write(out);
            System.out.println(byteArrayOutputStream.toString());
            fileOutputStream.close();



        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

