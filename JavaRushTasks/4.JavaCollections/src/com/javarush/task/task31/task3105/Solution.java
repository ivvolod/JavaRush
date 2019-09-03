package com.javarush.task.task31.task3105;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/
public class Solution {

    public static void main(String[] args) throws IOException {
//        String path = "D:\\Уроки\\JavaRushTasks\\JavaRushTasks\\4.JavaCollections\\src\\com\\javarush\\task\\task31\\task3105\\resourse\\DocFirst.zip";
        Map<ZipEntry, byte[] > map = new HashMap<>();
        Path filename;
        ZipEntry entry;
        ZipEntry entryExtFile;
        boolean isPresent = false;
        byte[] buffer;
        try (FileInputStream fis = new FileInputStream(args[1]); ZipInputStream zis = new ZipInputStream(fis)) {
//            String entryName;

            while ((entry = zis.getNextEntry()) != null){
//                entryName = entry.getName();
                buffer = new byte[(int) entry.getSize()];
                zis.read(buffer);
                map.put(entry, buffer);
                zis.closeEntry();

            }
            System.out.println(map.toString());

        }catch (Exception e){
            e.getStackTrace();
        }
//        try(ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(args[1]));){
//            String fileName = args[0].substring(args[0].lastIndexOf(File.separator)+1);
//            entry = new ZipEntry("new/" +fileName );
//            zipOut.putNextEntry(entry);
//            Files.copy(Paths.get(args[0]),zipOut);
//            zipOut.closeEntry();
//            for (Map.Entry<ZipEntry, byte[] > item:map.entrySet()
//            ) {
//                entry =new ZipEntry(item.getKey().getName());
//                if(!entry.getName().endsWith(fileName)){
//                    zipOut.putNextEntry(entry);
//                    zipOut.write(item.getValue());
//                    zipOut.closeEntry();
//                }
//            }
//
//        }catch (IOException e) {
//            e.printStackTrace();
//       }
//        try(ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(path))) {
        try(ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(args[1]))) {
            filename = Paths.get(args[0]).getFileName();

            for (Map.Entry <ZipEntry, byte[]> item : map.entrySet()) {
                entry = new ZipEntry(item.getKey().getName());
                zos.putNextEntry(entry);
//                if (entry.getName().endsWith(String.valueOf(filename))){
                if (entry.getName().endsWith("new\\" + filename)){
                    isPresent = true;
                    Files.copy(Paths.get(args[0]), zos);
                    zos.closeEntry();
                }else {
                    zos.write(item.getValue());
                    zos.closeEntry();
                }
            }
            if (!isPresent){
                entryExtFile = new ZipEntry("new\\" + filename);
                zos.putNextEntry(entryExtFile);
                Files.copy(Paths.get(args[0]), zos);
                zos.closeEntry();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
