package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
//        SpecialThread specialThread = ;
//        SpecialThread specialThread2 = new SpecialThread();
//        SpecialThread specialThread3 = new SpecialThread();
//        SpecialThread specialThread4 = new SpecialThread();
//        SpecialThread specialThread5 = new SpecialThread();
//        Thread thread = new Thread(new SpecialThread());
//        Thread thread2 = new Thread(new SpecialThread());
//        Thread thread3 = new Thread(new SpecialThread());
//        Thread thread4 = new Thread(new SpecialThread());
//        Thread thread5 = new Thread(new SpecialThread());
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));


    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
