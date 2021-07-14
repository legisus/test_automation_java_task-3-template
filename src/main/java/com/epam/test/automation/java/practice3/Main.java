package com.epam.test.automation.java.practice3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int[] task1(int[] arr) {

        IntStream.range(0, arr.length / 2).forEach(i -> {
            int temp = arr[i];
            if (temp % 2 == 0 && (arr[arr.length - i - 1]) % 2==0) {
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }
        });
        return arr;
    }


    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int[] array) {
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int[][] task3(int[][] matrix) {
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
    }

//    public static void main(String[] args) {
//        int[] ints = {10, 5, 3, 4};
//        System.out.println("Before: 10, 5, 3, 4");
//        System.out.println(Arrays.toString(task1(ints)));
//        System.out.println("Before: 100, 2, 3, 4, 5");
//        int[] ints2 = {100, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(task1(ints2)));
//        System.out.println("Before: 100, 2, 3, 45, 33, 8, 4, 54");
//        int[] ints3 = {100, 2, 3, 45, 33, 8, 4, 54};
//        System.out.println(Arrays.toString(task1(ints3)));
//    }

}

