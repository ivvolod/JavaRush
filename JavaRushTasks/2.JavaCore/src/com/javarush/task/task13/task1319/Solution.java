package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        

        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = bufferedReader.readLine();
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter out = new BufferedWriter(fileWriter);
            String line;
            boolean isFirsLine = true;
            do {
                if(!isFirsLine){
                    out.newLine();
                }else{
                    isFirsLine =false;
                }
                line = bufferedReader.readLine();

                out.write(line);


//                System.out.println(line);
            }while(!(line).equals("exit"));
            out.flush();
            out.close();
            fileWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
