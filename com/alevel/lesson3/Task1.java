package com.alevel.lesson3;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
            System.out.println(array[i]);
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double res = sum / array.length;
        System.out.println("среднее арифметическое");
        System.out.println(res);
    }
}
