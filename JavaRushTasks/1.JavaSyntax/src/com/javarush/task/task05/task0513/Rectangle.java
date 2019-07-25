package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int left, top, width, height;

    public void initialize(int left, int top, int width, int height) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }
    public void initialize(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public void initialize(int width, int height) {
        this.height = height;
        this.width = width;
    }
    public void initialize(int height) {
        this.height = height;
        this.width = height;
    }

    public static void main(String[] args) {

    }
}
