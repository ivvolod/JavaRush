package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        TreeSet<Integer> treeSet = new TreeSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        try {
//
            String fileName = bufferedReader.readLine();
//            File file = new File("D:\\Уроки\\JavaRushTasks\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task13\\task1326\\"+fileName);
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            String line;
//            while (!(line = bufferedReader.readLine()).equals("exit")){
//                bufferedWriter.write(line);
//                bufferedWriter.newLine();
//            }



//            FileInputStream fileInputStream = new FileInputStream("D:\\Уроки\\JavaRushTasks\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task13\\task1326\\"+fileName);
//            FileInputStream fileInputStream = new FileInputStream("D:\\Уроки\\JavaRushTasks\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task13\\task1326\\file1.txt" );
            FileInputStream fileInputStream = new FileInputStream(fileName);
            BufferedReader buff = new BufferedReader(new InputStreamReader(fileInputStream));
//            String c;
            while (buff.ready()){
                int i = Integer.parseInt(buff.readLine());
//                System.out.println(Integer.parseInt(buff.readLine()));
                if (i%2 == 0){
                    list.add(i);
                }

            }
            buff.close();


//            bufferedWriter.close();
//            bufferedReader.close();
//            fileWriter.flush();
//            fileWriter.close();
//            fileInputStream.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        Collections.sort(list);
        for (int element: list) {
            System.out.println(element);
        }
    }
}
