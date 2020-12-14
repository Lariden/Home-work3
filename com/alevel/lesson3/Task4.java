package com.alevel.lesson3;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100);
            System.out.println(arr[i]);
        }
        System.out.println("чётные заменяем на 0");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
                System.out.println(arr[i]);

            }


        }
    }
}
