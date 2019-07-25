package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {
//        System.out.println(result);
    }
    
    static {

        reset();

    }

    public static CanFly result;


    public static void reset(){
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        while (true){
//                String res = bufferedReader.readLine();
//                if(res.equals("helicopter")){
//                    result = new Helicopter();
//                } else if(res.equals("plane")){
//                    int numberPassengers = Integer.parseInt(bufferedReader.readLine());
//                    result = new Plane(numberPassengers);
//                }else if (res ==null)break;
//            }
//        bufferedReader.close();
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
//            while (true){
//                String res = bufferedReader.readLine();
//                if(res.equals("helicopter")){
//                    result = new Helicopter();
//                } else if(res.equals("plane")){
//                    int numberPassengers = Integer.parseInt(bufferedReader.readLine());
//                    result = new Plane(numberPassengers);
//                }else if (res ==null)break;
//            }

            String res = bufferedReader.readLine();
            if(res.equals("helicopter")){
                result = new Helicopter();
            } else if(res.equals("plane")) {
                int numberPassengers = Integer.parseInt(bufferedReader.readLine());
                result = new Plane(numberPassengers);
            }



        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
