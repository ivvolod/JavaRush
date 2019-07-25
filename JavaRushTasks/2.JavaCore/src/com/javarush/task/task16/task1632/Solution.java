package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new ThreadExample1());
        threads.add(new ThreadExample2());
        threads.add(new ThreadExample3());
        threads.add(new ThreadExample4());
        threads.add(new ThreadExample5());

    }
    public static void main(String[] args) {
        for (Thread list:threads) {
            list.start();
        }
    }



}
class ThreadExample1 extends Thread{
    @Override
    public void run() {
        while (true){

        }
    }
}
class ThreadExample2 extends Thread{
    @Override
    public void run() {
        try{
            while (true){
                Thread.sleep(20);
            }
        }catch(InterruptedException e){
            System.out.println("InterruptedException");
        }

    }
}
class ThreadExample3 extends Thread{
    @Override
    public void run() {
        try {
            while (true){
                System.out.println("Ура");
                Thread.sleep(500);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class ThreadExample4 extends Thread implements Message{
    private boolean stop = false;

    @Override
    public void run() {
        while(!stop){
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void showWarning() {
        stop = true;
    }
}
class ThreadExample5 extends Thread{
    @Override
    public void run() {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int sum = 0;
            String str = "";
            while (true){
                str = bufferedReader.readLine();
                if (str.equals("N")){
                    break;
                }else sum += Integer.parseInt(str);

            }
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
