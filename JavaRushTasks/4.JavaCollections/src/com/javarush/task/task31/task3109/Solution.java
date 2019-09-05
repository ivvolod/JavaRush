package com.javarush.task.task31.task3109;

import java.io.*;
import java.nio.file.Paths;
import java.util.Properties;

/* 
Читаем конфиги
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {
        Properties properties = new Properties();
//        String workDir = System.getProperty("user.dir");
//        System.out.println(workDir);
//        String fullFileName = workDir + File.separator + fileName;
//        File file = new File(fullFileName);
        File file = new File(fileName);
        try {
            InputStream inputStream = new FileInputStream(file);
//            if (fullFileName.endsWith("xml")){
            if (fileName.endsWith("xml")){
                properties.loadFromXML(inputStream);
            }else properties.load(inputStream);

        } catch (FileNotFoundException e) {
            new Properties();
        } catch (IOException e) {
            new Properties();
        }

        return properties;
    }
}
