package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    private String fileName;
    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);

//        Pattern pattern = Pattern.compile("(.txt)$");
//        Matcher matcher = pattern.matcher(fileName);
        if (!fileName.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }else this.fileName = fileName;
    }
    public static void main(String[] args) {
    }

//    public void checkName(String fileName) throws UnsupportedFileNameException {
//
//        Pattern pattern = Pattern.compile("(.txt)$");
//        Matcher matcher = pattern.matcher(fileName);
//        if (!matcher.find()){
//            throw new UnsupportedFileNameException();
//            super.close();
//            }
//
//    }
}

