package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
//        String index = args[0];
        String value;
        String textRow;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = bufferedReader.readLine();

            StringBuffer stringBuffer = new StringBuffer();
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

            while (bufferedReader2.ready()){
                value = bufferedReader2.readLine();

                if (value.startsWith(args[1])){

                    if ((args[0].equals("-u"))) {
                        textRow = String.format("%-8s%-30s%-8s%-4s", args[1], args[2], args[3], args[4]);
                        stringBuffer.append(textRow + "\n");
                    } else if (!(args[0].equals("-d"))){
                        stringBuffer.append(value + "\n");
                    }
                }else stringBuffer.append(value + "\n");

            }
            bufferedReader2.close();

//            System.out.println(stringBuffer.toString());
            FileWriter fileWriter = new FileWriter(fileName, false);

            fileWriter.write(stringBuffer.toString());

            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
