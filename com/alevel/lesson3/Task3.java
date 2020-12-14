package com.alevel.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.println(array[i]);
        }

        System.out.println("составные числа");
        boolean[] comp;
        comp = new boolean[array.length];
        Arrays.fill(comp, true);
        for (int j = 0; j < comp.length; j++) {
            for (int x = 2; x <= j / 2; x++) {
                if (j % x == 0)
                    System.out.println(j);
            }
        }
    }
}
