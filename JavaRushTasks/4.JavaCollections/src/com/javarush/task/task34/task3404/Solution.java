package com.javarush.task.task34.task3404;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

/*
Рекурсия для мат. выражения
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.recurse("sin(2*(-5+1.5*4)+28)", 0); //expected output 0.5 6
    }

    public void recurse(final String expression, int countOperation) {
        //implement
        if (expression.startsWith("(") && expression.endsWith(")")) {
            recurse(expression.substring(1, expression.length() - 1), countOperation);
        } else if (!expression.startsWith("(") && expression.endsWith(")")) {

            while (countOperation < expression.length() - 1) {
                countOperation++;
                StringBuffer stringBuffer = new StringBuffer();
                if (Character.isAlphabetic(expression.charAt(countOperation))) {
                    stringBuffer.append(expression.charAt(countOperation));
                }
                String operation = stringBuffer.toString();


            }

        } else if (expression.startsWith("sin(") && expression.endsWith(")")) {
            recurse(expression.substring(4, expression.length() - 1), countOperation);
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            while (countOperation < expression.length() - 1) {
                if (Character.isDigit(expression.charAt(countOperation))
                        || expression.charAt(countOperation) == '.'
                        || expression.charAt(countOperation) == '-') {
                    stringBuffer.append(expression.charAt(countOperation));
                    countOperation++;
                }
                double leftOperand = Double.parseDouble(stringBuffer.toString());


//                if (expression.charAt(countOperation) == operation)
                char operation = expression.charAt(countOperation);

                recurse(expression.substring(countOperation + 1), countOperation);

//                switch (operation) {
//                    case "(":
//                        return;
//                    case "+":
//                        return;
//                    case "-":
//                        return;
//
//
//                }
//
//
//                if (expression.charAt(countOperation) == '(') {
//                    recurse(expression.substring(1, expression.length() - 1), countOperation);
//                }
//                double rightOperand



            }
        }
    }

    public Solution() {
            //don't delete
        }
    


}
