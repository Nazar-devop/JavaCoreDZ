package com.company;

public class Main6 {
    public static void main(String[] args) {
        int[] array = {23,534,5,345,235,54365};
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length ; i++) {
            if(array[i] > max){
                max = array[i];
            }
            for (int x:array){
                if (x < min) min = x;
            }

        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
