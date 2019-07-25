package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReaderName = new BufferedReader(new InputStreamReader(System.in))) {
            String firstFileName = bufferedReaderName.readLine();
            String secondFileName = bufferedReaderName.readLine();
            FileReader fileReader = new FileReader(firstFileName);
            FileWriter fileWriter = new FileWriter(secondFileName);
            BufferedReader bufferedReaderData = new BufferedReader(fileReader);
            String data;
            StringBuffer stringBuffer = new StringBuffer();
//            String dataInt = null;
            Pattern pattern = Pattern.compile("\\b\\d+\\b");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while ((data = bufferedReaderData.readLine()) != null){
                Matcher match = pattern.matcher(data);
                while (match.find()){
//                  System.out.println(match.group());
                    System.out.println(stringBuffer.append(match.group() + " "));
//                    System.out.print(dataInt);
                    
                }

                bufferedWriter.write(String.valueOf(stringBuffer));

            }
            fileReader.close();
            bufferedReaderData.close();
//            FileWriter fileWriter = new FileWriter("D:\\Уроки\\JavaRushTasks\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1908\\second");
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(String.valueOf(stringBuffer));

            fileWriter.close();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
