package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Locale.ENGLISH;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))){
            String dataPeople;
            String data;
            String fullName;
            Date birthDate;

            while (bufferedReader.ready()){
                dataPeople = bufferedReader.readLine();

                fullName = dataPeople.replaceAll("\\d+" , "");
                fullName = fullName.trim();
                data = dataPeople.replaceAll("\\D+\\s", "");

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
                simpleDateFormat.applyPattern("dd MM yyyy");
                birthDate = simpleDateFormat.parse(data);


                PEOPLE.add(new Person(fullName, birthDate));
//                System.out.println(fullName);
//                System.out.println(birthDate);
//                System.out.println(PEOPLE);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }


}