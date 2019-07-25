package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            int numFirst = Integer.getInteger(bufferedReader.readLine());
            if (WholePositiveCheck.wholePositiveCheck(numFirst))throw new WholePositivelException("This number is not integer and not positive", numFirst);
            int numSecond = Integer.getInteger(bufferedReader.readLine());
            if (WholePositiveCheck.wholePositiveCheck(numFirst))throw new WholePositivelException("This number is not integer and not positive", numSecond);


//        }catch (){
            
        }
    }
}

class WholePositivelException extends Exception{

    private int num;
    public int getNumber(){
        return num;
    }
    public WholePositivelException(String message, int num){

        super(message);
        this.num = num;
    }
}
class WholePositiveCheck {
    public static boolean wholePositiveCheck(int number){
        if ((number%1 == 0) && (number > 0)){
            return true;
        }else return false;

    }
}
class NOD{

}
