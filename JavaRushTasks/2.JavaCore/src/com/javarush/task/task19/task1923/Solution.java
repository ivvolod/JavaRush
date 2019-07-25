package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {

            String line;

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));
            Pattern pattern = Pattern.compile("\\S*\\d\\S*");

            while (bufferedReader.ready()){
                line = bufferedReader.readLine();
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){

                    bufferedWriter.write(matcher.group()+ " ");
                }

            }
            bufferedWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
