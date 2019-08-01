package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {

        File dir = new File (root);
        List<String> getFileTree = new ArrayList<>();
        ArrayDeque<File> arrayDeque = new ArrayDeque<>(Arrays.asList(dir.listFiles()));
        File file;
        while ((file = arrayDeque.pollFirst()) != null){
            if (file.isFile()){
                getFileTree.add(file.getAbsolutePath());
            }else if (file.isDirectory()){
                for (File item:file.listFiles()){
                    arrayDeque.addLast(item);
                }

            }
        }
//        System.out.println(getFileTree.toString());
        return getFileTree;

    }

    public static void main(String[] args) {
        try {
            getFileTree("D:\\Уроки\\JavaRushTasks\\JavaRushTasks\\4.JavaCollections\\src\\com\\javarush\\task\\task31\\task3102\\Folder_0");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
