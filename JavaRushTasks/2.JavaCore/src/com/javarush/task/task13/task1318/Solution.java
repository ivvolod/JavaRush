package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); FileInputStream file = new FileInputStream(reader.readLine())){
            while(file.available() > 0){
                System.out.print((char)file.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}