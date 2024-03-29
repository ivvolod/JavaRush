package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = bufferedReader.readLine();
            secondFileName = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();

        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {

        private String fullFileName;
        private String fileContent = "";


        public ReadFileThread(){
            new Thread();
        }

        @Override
        public void run() {
            try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fullFileName))
            ) {
                StringBuffer stringBuffer = new StringBuffer();
                while(bufferedReader.ready()){
                    stringBuffer.append(bufferedReader.readLine() + " ");
                }
                fileContent = stringBuffer.toString();

            } catch (FileNotFoundException e) {
                e.printStackTrace();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


            @Override
        public void setFileName(String fullFileName){
                this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {

            return this.fileContent;
        }


////        public void join() {
//
//        }
//
////        @Override
//        public void start() {
//
//        }
    }
}
