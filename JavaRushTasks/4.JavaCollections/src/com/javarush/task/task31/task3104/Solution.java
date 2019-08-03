package com.javarush.task.task31.task3104;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* 
Поиск скрытых файлов
*/
public class Solution extends SimpleFileVisitor<Path> {
    public static void main(String[] args) throws IOException {
        EnumSet<FileVisitOption> options = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        final Solution solution = new Solution();
//        Files.walkFileTree(Paths.get("D:/"), options, 20, solution);
        Files.walkFileTree(Paths.get("D:\\Уроки\\JavaRushTasks\\JavaRushTasks\\4.JavaCollections\\src\\com\\javarush\\task\\task31\\task3104\\Test"), options, 20, solution);

        List<String> result = solution.getArchived();
        System.out.println("All archived files:");
        for (String path : result) {
            System.out.println("\t" + path);
        }

        List<String> failed = solution.getFailed();
        System.out.println("All failed files:");
        for (String path : failed) {
            System.out.println("\t" + path);
        }

    }

    private List<String> archived = new ArrayList<>();
    private List<String> failed = new ArrayList<>();


    public List<String> getArchived() {
        return archived;
    }

    public List<String> getFailed() {
        return failed;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//        String pattern = "glob:*.zip";
        String pattern = "glob:*.zip";
        String pattern2 = "glob:*.rar";
//        archived.add(String.valueOf(file));
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(pattern);
        PathMatcher pathMatcher2 = FileSystems.getDefault().getPathMatcher(pattern2);
        if (pathMatcher.matches(file.getFileName()) || pathMatcher2.matches(file.getFileName())){
            archived.add(String.valueOf(file));
        }

        return super.visitFile(file, attrs);
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        failed.add(file.toString());
        return FileVisitResult.SKIP_SUBTREE;
    }
}
