package com.alevel.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.println(array[i]);
        }

        System.out.println("простые числа");
        boolean[] prim;
        prim = new boolean[array.length];
        Arrays.fill(prim, true);
        prim[0] = false;
        prim[1] = false;
        for (int j = 2;  j < prim.length; ++j) {
            if (prim[j]) {
                for (int x = 2 ; j * x < prim.length;++x) {
                    prim[j*x] = false;
                    System.out.println(j);
                }
            }
        }
    }
}
