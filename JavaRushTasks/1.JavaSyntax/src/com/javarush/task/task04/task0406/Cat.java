package com.javarush.task.task04.task0406;

/* 
Программа учета имен
*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
        System.out.println(this.fullName);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Иванников","Владимир");
    }
}
