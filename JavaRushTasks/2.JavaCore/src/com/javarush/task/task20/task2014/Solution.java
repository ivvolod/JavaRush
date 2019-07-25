package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) {
        System.out.println(new Solution(4));

        File file = new File("D:/MySolutionClass.data");
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        Solution savedObject = new Solution(1);

        try {
            fos = new FileOutputStream(file);
            if (fos != null){
                oos = new ObjectOutputStream(fos);
                oos.writeObject(savedObject);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(oos!= null){
                try {
                    fos.close();
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        Solution solution = new Solution(2);

        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);
            if (fis != null){
                ois = new ObjectInputStream(fis);
                Solution loadedObject = (Solution)ois.readObject();
                if (savedObject.string.equals(loadedObject.string)){
                    System.out.println("savedObject equals loadedObject");
                } else System.out.println("not equal");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
