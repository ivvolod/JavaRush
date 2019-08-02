package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {

    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private List <Path> foundFiles = new ArrayList<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length

        if (isComparable(content, file)){
            foundFiles.add(file);
        }

        return super.visitFile(file, attrs);
    }

    public boolean isComparable(byte[] content, Path file){
        return isMaxSize(content)
                && isMinSize(content)
                && isPartOfContent(content)
                && isPartOfName(file);
    }
    private boolean isMaxSize(byte[] content){
        return this.maxSize == 0 || content.length < this.maxSize;
    }
    private boolean isMinSize(byte[] content){
        return this.minSize == 0 || content.length > this.minSize;
    }
    private boolean isPartOfContent(byte[] content){
        String partOfContentSt = new String(content);
        return this.partOfContent == null || partOfContentSt.contains(this.partOfContent);
    }
    private boolean isPartOfName(Path file){
        String fileName = String.valueOf(file.getFileName());
        return this.partOfName == null || fileName.contains(this.partOfName);
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }
}
