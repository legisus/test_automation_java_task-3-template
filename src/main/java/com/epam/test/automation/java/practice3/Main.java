package com.epam.test.automation.java.practice3;

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
            if (temp % 2 == 0 && (arr[arr.length - i - 1]) % 2 == 0) {
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
        int result;
        int maxValue = 0;
        int indexOfMaxValue = 0;
        int lastIndexMaxValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
                indexOfMaxValue = i + 1;
            }
            for (int j = i; j < array.length; j++) {
                if (maxValue == array[j]) {
                    lastIndexMaxValue = j + 1;
                }
            }
        }
        result = lastIndexMaxValue - indexOfMaxValue;

        return result;
    }


    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int[][] task3(int[][] matrix) {
        int[][] result = matrix;

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (i > j) {
                    result[i][j] = 0;
                } if (i < j){
                    result[i][j] = 1;
                }
            }
        }
        return result;
    }
}



