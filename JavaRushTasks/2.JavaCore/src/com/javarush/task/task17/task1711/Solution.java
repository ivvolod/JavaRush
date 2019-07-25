package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
//        ExecutorService executorService = Executors.newFixedThreadPool(2);


        String id;
        String name;
        String sex;
        String bd;

        switch (args[0]){
            case "-c":
                synchronized (allPeople){
                    for (int i = 1; i < args.length;) {
                        name = args[i];
                        i++;
                        sex = args[i];
                        i++;
                        bd = args[i];
                        i++;
                        System.out.println(createPerson(name, sex, bd));
                    }
                }

//                name = args[1]; sex = args[2]; bd = args[3];
//                System.out.println(createPerson(name, sex, bd));

                break;

            case "-u":
                synchronized (allPeople){
                    for (int i = 1; i < args.length;) {
                        id = args[i];
                        i++;
                        name = args[i];
                        i++;
                        sex = args[i];
                        i++;
                        bd = args[i];
                        i++;
                        updatePerson(id, name, sex, bd);
                    }
                }

//                id = args[1]; name = args[2]; sex = args[3]; bd = args[4];
//                updatePerson(id, name, sex, bd);

                break;

            case "-d":
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        id = args[i];
                        deletePerson(id);
                    }
                }

//                id = args[1];
//                deletePerson(id);

                break;

            case "-i":
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        id = args[i];
                        toString(id);
                    }
                }

//                id = args[1];
//                toString(id);
                break;
        }



    }
    private static Date dateParsing(String bd) {
        Date parsingDate = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
        try {
            parsingDate = ft.parse(bd);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parsingDate;
    }
    private static int createPerson(String name, String sex, String bd){
        int index = allPeople.size();

        if (sex.equals("ж")){

            allPeople.add(Person.createFemale(name,dateParsing(bd)));

        }else if(sex.equals("м")){

            allPeople.add(Person.createMale(name,dateParsing(bd)));
        }return index;
    }
    private static void updatePerson(String id, String name, String sex, String bd){
        Person johnDoe = allPeople.get(Integer.parseInt(id));
        johnDoe.setName(name);
        johnDoe.setSex(sex.equals("м")? Sex.MALE:Sex.FEMALE);
        johnDoe.setBirthDate(dateParsing(bd));
        allPeople.set(Integer.parseInt(id), johnDoe);

    }
    private static void deletePerson(String id){
        Person johnDoe = allPeople.get(Integer.parseInt(id));
        johnDoe.setName(null);
        johnDoe.setSex(null);
        johnDoe.setBirthDate(null);

    }
    private static void toString(String id) {
        String  sex;
        String name;
        String date;

        Person johnDoe = allPeople.get(Integer.parseInt(id));

        name = johnDoe.getName();
        sex = (johnDoe.getSex() == Sex.MALE) ? "м" : "ж";


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        date = simpleDateFormat.format(johnDoe.getBirthDate());

        System.out.println(name + " " + sex + " " + date);
    }



}
