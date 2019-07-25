package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
//        File fileAllLines = new File("D:\\Уроки\\JavaRushTasks\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task17\\ask1721");
//        File fileSecond = new File("D:\\Уроки\\JavaRushTasks\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task17\\task1721");

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String fileAllLines = buff.readLine();
        String fileForRemoveLines = buff.readLine();

        buff.close();

        String buffered1;
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileAllLines));
        while ((buffered1 = bufferedReader1.readLine()) != null){
            allLines.add(buffered1);

        }
        bufferedReader1.close();

        String buffered2;
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileForRemoveLines));
        while ((buffered2 = bufferedReader2.readLine()) != null){
            forRemoveLines.add(buffered2);
        }
        bufferedReader2.close();

//        System.out.println(allLines);
//        System.out.println(forRemoveLines);

        Solution solution = new Solution();
        solution.joinData();

//        System.out.println(allLines);
//        System.out.println(forRemoveLines);

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.size() >= forRemoveLines.size()){
            for (String frl: forRemoveLines) {
                if (allLines.contains(frl) == true){
                    allLines.remove(frl);
                } else {
                    allLines.clear();
                    throw new CorruptedDataException();
                }

            }
        }else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
