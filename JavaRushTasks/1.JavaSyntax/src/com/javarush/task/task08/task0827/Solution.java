package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {


       System.out.println(isDateOdd("January 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date dateEnd = format.parse(date);
        long dif = dateEnd.getTime();
        System.out.println(dif);
        int day = (int) (dif/(24*60*60*1000));
        System.out.println(day);

        return day%2 != 0? true: false;
    }
}
