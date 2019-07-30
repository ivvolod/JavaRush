package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;
import java.util.TreeMap;

/*
Проход по дереву файлов
*/
class MyFileVisitor extends SimpleFileVisitor<Path>{
//    TreeMap<String, File> treeMap = new TreeMap<>();
//    @Override
//    public FileVisitResult visitFile (Path path, BasicFileAttributes attr) throws IOException{
//        if (Files.exists(path)&& path.toFile().length() <= 50){
//           treeMap.put(path.getFileName().toString(), path.toFile());
//        }
//        return FileVisitResult.CONTINUE;
//    }

}
public class Solution {
    public static void main(String[] args) {
        TreeMap<String, File> treeMap = new TreeMap<>();
        File resultFileAbsolutePath = new File(args[1]);
        File newFileName = new File(resultFileAbsolutePath.getParent() + File.separator + "allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, newFileName);

        Path path = Paths.get(args[0]);

        try (FileOutputStream fos = new FileOutputStream(newFileName)){
            Files.walkFileTree(path, new SimpleFileVisitor<Path>(){
                @Override
                public FileVisitResult visitFile (Path path, BasicFileAttributes attr) throws IOException{
                    if (Files.exists(path)&& path.toFile().length() <= 50){
                        treeMap.put(path.getFileName().toString(), path.toFile());
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
            for (Map.Entry<String, File> item:treeMap.entrySet()) {
                FileInputStream fis = new FileInputStream(item.getValue());

                byte[] buffer = new byte[fis.available()];
                fis.read(buffer, 0, fis.available());
                fis.close();
                fos.write(buffer, 0 , buffer.length);
                fos.write(10);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
