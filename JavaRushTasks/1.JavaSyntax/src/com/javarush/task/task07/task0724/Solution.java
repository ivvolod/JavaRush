package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human father = new Human("Виктор", true, 25);
        System.out.println(father.toString());
        Human mother = new Human("Ольга", false, 23);
        System.out.println(mother.toString());
        Human grandfather = new Human("Павел", true, 56);
        System.out.println(grandfather.toString());
        Human grandmother = new Human("Мила", false, 53);
        System.out.println(grandmother.toString());
        Human son1 = new Human("Коля", true, 10, father, mother);
        System.out.println(son1.toString());
        Human daughter1 = new Human("Катя", false, 12, father, mother);
        System.out.println(daughter1.toString());
        Human son2 = new Human("Серега", true, 16, father, mother);
        System.out.println(son2.toString());
        Human daughter2 = new Human("Маша", false, 2, father, mother);
        System.out.println(daughter2.toString());
        Human daughter3 = new Human("Аня", false, 3, father, mother);
        System.out.println( daughter3.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;


        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}