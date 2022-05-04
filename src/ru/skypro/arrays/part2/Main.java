package ru.skypro.arrays.part2;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        // задание 1
        System.out.println("задание 1");

        int totalCost = 0;
        for (int i = 0; i < arr.length; i++) {
            totalCost+=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Сумма трат за месяц составила " + totalCost + " рублей.");

        // задание 2
        System.out.println("задание 2");

        int maxCost = arr[0];
        int minCost = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCost) {
               maxCost = arr[i];
            }
            else if (arr[i] < minCost) {
                minCost = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxCost);
        System.out.println("Минимальная сумма трат за день составила " + minCost);

        // задание 3

        System.out.println("задание 3");
        double midCost =  (double) totalCost/30;
        System.out.println("Средняя сумма трат за день составила " + midCost);

        // задание 4
        System.out.println("задание 4");

        char[]reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (char i = 10; i  < reverseFullName.length; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
        }

    }







