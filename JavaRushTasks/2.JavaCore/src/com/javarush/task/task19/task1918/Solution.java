package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReaderFileName = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName =bufferedReaderFileName.readLine();
            BufferedReader bufferedReaderFileData = new BufferedReader(new FileReader(fileName));

//            String str = "(<" + args[0]+ ".*\\s?.*>(<" + args[0] + ">.*\\s?<\\/" + args[0] + ">).*<\\/" + args[0] +">)(.*\\/" +args[0]+">)(.*" + args[0]+">)";
//            System.out.println(str);
//            Pattern pattern = Pattern.compile(str);
            StringBuffer stringBuffer = new StringBuffer();

            while (bufferedReaderFileData.ready()){
                stringBuffer.append(bufferedReaderFileData.readLine());
            }
            Map<Integer, Integer> tagIndices = new TreeMap<>();

            Matcher m = Pattern.compile("(<\\s*/?\\s*" + args[0] + ".*?>)").matcher(stringBuffer.toString());
            while (m.find()){
                if (m.group().matches("<\\s*" + args[0] + ".*?>"))
                    tagIndices.put(m.start(), null);
                else {
                    Integer openingTag = null;
                    for (Integer i : tagIndices.keySet())
                        if (tagIndices.get(i) == null)
                            openingTag = i;
                    tagIndices.put(openingTag, m.end());
                }
            }
            for (Map.Entry<Integer, Integer> entry : tagIndices.entrySet())
                System.out.println(stringBuffer.toString().substring(entry.getKey(), entry.getValue()));


//            Matcher matcher = pattern.matcher(stringBuffer.toString());
//            while (matcher.find()){
//
//                for (int i = 1; i < matcher.groupCount()+1; i++) {
//                    System.out.println(matcher.group(i));
//                }
//            }

            bufferedReaderFileData.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
