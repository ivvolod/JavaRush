package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private boolean adult;
        private int weight;
        private int growth;

        public Human() {
            String name = "Humanoid";
            String age = "old";
            String sex = "vague";
        }

        public Human(String name) {
            this.name = name;
        }
        public Human(String name ,int age) {
            this.name = name;
            this.age = age;
        }
        public Human(String name ,int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name ,int age, boolean sex, boolean adult) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.adult = adult;
        }
        public Human(String name ,int age, boolean sex, boolean adult, int weight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.adult = adult;
            this.weight = weight;
        }
        public Human(String name ,int age, boolean sex, boolean adult, int weight,int growth) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.adult = adult;
            this.weight = weight;
            this.growth = growth;
        }
         public Human(Human name ,int age, boolean sex, boolean adult, int weight,int growth) {
            this.age = age;
            this.sex = sex;
            this.adult = adult;
            this.weight = weight;
            this.growth = growth;
        }
        public Human(Human name ,Human age, boolean sex, boolean adult, int weight,int growth) {
            this.sex = sex;
            this.adult = adult;
            this.weight = weight;
            this.growth = growth;
        }
        public Human(Human name ,Human age, Human sex, boolean adult, int weight,int growth) {
            this.adult = adult;
            this.weight = weight;
            this.growth = growth;
        }


    }
}
