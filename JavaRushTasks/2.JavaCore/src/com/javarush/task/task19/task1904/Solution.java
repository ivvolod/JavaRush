package com.javarush.task.task19.task1904;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;
        public PersonScannerAdapter (Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
//            Scanner scanner = new Scanner("file");
//            String stringLine = scanner.nextLine();
            String[] personParse = fileScanner.nextLine().split(" ", 4);
            String firstName = personParse[1];
            String middleName = personParse[2];
            String lastName = personParse[0];
            String birt = personParse[3];
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
            Date birthDate = null;
            try {
                birthDate = simpleDateFormat.parse(birt);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Person person = new Person(firstName, middleName, lastName, birthDate);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
