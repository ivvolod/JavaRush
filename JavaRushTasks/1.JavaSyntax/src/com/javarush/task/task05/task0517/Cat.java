package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name = null;
    int age , weight;
    String address = null;
    String color;

    public Cat(String name) {
        this.name = name;
        this.weight = 2;
        this.age = 5;
        this.color = "vague";
    }
    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "vague";
    }
    public Cat(String name, int age) {
        this.name = name;
        this.weight = 2;
        this.age = age;
        this.color = "vague";
    }
    public Cat(int weight, String color) {
        this.weight = weight;
        this.age = 5;
        this.color = color;
    }
    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.age = 5;
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
