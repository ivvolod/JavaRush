package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double indexMassBody = weight/(height*height);
            if (indexMassBody < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            } else if (indexMassBody <= 24.9 || indexMassBody >= 18.5) {
                System.out.println("Нормальный: между 18.5 и 24.9");
            } else if (indexMassBody <= 29.9 || indexMassBody >= 25) {
                System.out.println("Избыточный вес: между 25 и 29.9");
            } else if (indexMassBody >= 30) {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}
