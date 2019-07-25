package com.javarush.task.task31.task3101;

import java.io.File;
import java.util.TreeMap;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) {
        TreeMap<String, File> treeMap = new TreeMap<>();
        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);

        public static void fileTree(File path, TreeMap<String, File> treeMap){
            if (path.isDirectory()){
                for (File entry:path.listFiles()) {
                    if (entry.length() <= 50 && entry.isFile()){
                        treeMap.put(entry.getName(), entry);
                    }else if (entry.isDirectory()){
                        fileTree(entry, treeMap);
                    }
                }
            }
        }



        File newFileName = new File(resultFileAbsolutePath.getParent() + File.separator + "allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, newFileName);



    }
}
