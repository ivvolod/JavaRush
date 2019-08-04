package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;

/* 
Что внутри папки?
*/
public class Solution extends SimpleFileVisitor<Path> {
    int countDirectory = -1;
    int countFile = 0;
    int sizeFile = 0;

    public static void main(String[] args) throws IOException {
        EnumSet<FileVisitOption> options = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        final Solution solution = new Solution();

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            String fileName = bufferedReader.readLine();
            Path path = Paths.get(fileName);
            if (Files.isDirectory(path)){
                Files.walkFileTree(path, options, 20, solution);
                System.out.println("Всего папок - " + solution.countDirectory);
                System.out.println("Всего файлов - " + solution.countFile);
                System.out.println("Общий размер - " + solution.sizeFile);

            }else System.out.println(path.toAbsolutePath() + " - не папка");

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        countDirectory ++;

        return super.preVisitDirectory(dir, attrs);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        countFile ++;
        sizeFile += attrs.size();

        return super.visitFile(file, attrs);
    }
}
