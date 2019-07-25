package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("DAVID BOWIE", df.parse("JANUARY 8 1947"));
        map.put("Albert Einstein", df.parse("March 14 1879"));
        map.put("Donald Trump", df.parse("JUNE 14 1946"));
        map.put("Elon Musk", df.parse("JUNE 28 1971"));
        map.put("Queen Victoria", df.parse("May 24 1819"));
        map.put("Arnold Schwarzenegger", df.parse("July 30 1947"));
        map.put("Freddie Mercury", df.parse("September 5 1946"));
        map.put("Patrick Swayze", df.parse("August 18 1952"));
        map.put("William Shakespeare", df.parse("April 23 1564"));
//        System.out.println(df.parse("May 24 1819"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        for (Date value : map.values()){
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setGregorianChange(value);
            if (calendar.get(Calendar.MONTH) == Calendar.JUNE ){
                map.remove(value);
            }

        }

    }

    public static void main(String[] args) throws ParseException {
//        createMap();
//        System.out.println(removeAllSummerPeople(createMap()));
    }
}
