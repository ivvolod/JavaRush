package com.javarush.task.task31.task3112;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));
//        System.out.println(passwords);
        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {

        URL url = new URL(urlString);
        InputStream inputStream = url.openStream();
        Path fileName = Paths.get(url.getFile()).getFileName();
//        System.out.println(fileName);
//        Path targetDirectory = Paths.get(downloadDirectory + File.separator + fileName);
        Path tempFile = Files.createTempFile("tempFile-", ".temp");


//        System.out.println(tempFile);
        Files.copy(inputStream, tempFile, StandardCopyOption.REPLACE_EXISTING);
//        System.out.println(tempFile);
        inputStream.close();
//        Path urlName = Paths.get(urlString);
        Path resultName = Paths.get(downloadDirectory.toString() + "/" + fileName.toString());
        Files.move(tempFile, resultName, REPLACE_EXISTING);
        return resultName;

    }
}
