package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ListIterator;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());

        }
//        int j = 0;
        for (int j = 0; j < m; j++) {
            list.add(list.get(j));

        }
        for (int i = m-1; i >= 0; i--) {
            list.remove(i);
        }

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
