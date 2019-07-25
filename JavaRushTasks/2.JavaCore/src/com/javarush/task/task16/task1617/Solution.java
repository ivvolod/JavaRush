package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            String comand = null;
            if (numSeconds > 3){
                comand = "Прервано!";
            }else comand = "Марш!";

            while (numSeconds > 0) {
                try {
                    Thread.sleep(1000);
                    System.out.print(numSeconds-- + " ");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(comand);


//            for (int i = numSeconds; i >= 1 ; i--) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.print(i + " ");
//            }
//            System.out.println(comand);
        }
    }
}
