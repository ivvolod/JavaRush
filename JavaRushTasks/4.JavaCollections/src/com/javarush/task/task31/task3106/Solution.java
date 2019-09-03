package com.javarush.task.task31.task3106;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String resultFileName = args[0];
        FileOutputStream fos = new FileOutputStream(resultFileName);
        String[] fileNameParts = Arrays.stream(args).skip(1).sorted().toArray(String[]::new);
        Vector<InputStream> inputStreamsVector = new Vector<>();
        for(String str : fileNameParts){
            inputStreamsVector.add(new FileInputStream(str));
        }
        try(ZipInputStream zis = new ZipInputStream(new SequenceInputStream(inputStreamsVector.elements()))) {
            ZipEntry zn = zis.getNextEntry();
            Files.copy(zis, Paths.get(args[0]));
        }
        fos.close();
    }
}
