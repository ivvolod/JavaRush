package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try (BufferedReader bufferedReaderFileName = new BufferedReader(new InputStreamReader(System.in))){
            String fileName1 = bufferedReaderFileName.readLine();
            String fileName2 = bufferedReaderFileName.readLine();
            BufferedReader bufferedReaderFile1 = new BufferedReader(new FileReader(fileName1));
            BufferedReader bufferedReaderFile2 = new BufferedReader(new FileReader(fileName2));
            List<String> stringList1 = new ArrayList<>();
            List<String> stringList2 = new ArrayList<>();

            while (bufferedReaderFile1.ready()){
                stringList1.add(bufferedReaderFile1.readLine());
            }
            while (bufferedReaderFile2.ready()){
                stringList2.add(bufferedReaderFile2.readLine());
            }
            int index1 = 0;
            int index2 = 0;
            while (index1 < stringList1.size() && index2 < stringList2.size()){
                if (stringList1.get(index1).equals(stringList2.get(index2))){
                    lines.add(new LineItem(Type.SAME, stringList1.get(index1)));
                    index1++;
                    index2++;
                }else if (index1+1 < stringList1.size() && stringList1.get(index1+1).equals(stringList2.get(index2))){
                    lines.add(new LineItem(Type.REMOVED, stringList1.get(index1++)));
                }else if (index2 +1 < stringList2.size() && stringList1.get(index1).equals(stringList2.get(index2+1))){
                    lines.add(new LineItem(Type.ADDED, stringList2.get(index2++)));
                }

            }
            if (index1 == stringList1.size() && index2 < stringList2.size()){
                lines.add(new LineItem(Type.ADDED, stringList2.get(index2)));
            }
            if (index2 == stringList2.size() && index1 < stringList1.size()){
                lines.add(new LineItem(Type.REMOVED, stringList1.get(index1)));
            }

            bufferedReaderFile1.close();
            bufferedReaderFile2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
