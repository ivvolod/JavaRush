package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends FileNotFoundException {
    }

    static class MyException2 extends ClassNotFoundException {
    }

    static class MyException3 extends IndexOutOfBoundsException{
    }

    static class MyException4 extends ArrayIndexOutOfBoundsException{
    }
}

