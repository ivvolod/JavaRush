package com.javarush.task.task17.task1706;

/* 
Синхронизированный президент
*/

public class Solution {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident );
    }

    public static class OurPresident{
        private static volatile OurPresident president;
        private OurPresident(){

        }
        public static OurPresident getOurPresident(){
            if (president == null){
                synchronized (OurPresident.class){
                    if (president == null){
                        president = new OurPresident();
                    }
                }
            }
            return president;
        }

    }
}

