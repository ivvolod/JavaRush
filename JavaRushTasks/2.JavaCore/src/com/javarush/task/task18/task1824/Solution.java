package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true){
                String  fileName = bufferedReader.readLine();
                try(FileInputStream fileInputStream = new FileInputStream(fileName)){

                }catch (FileNotFoundException e) {
                    System.out.println(fileName);
                    break;
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
