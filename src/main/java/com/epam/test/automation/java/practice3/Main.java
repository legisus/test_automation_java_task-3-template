package com.epam.test.automation.java.practice3;

import java.util.Arrays;
import java.util.HashMap;
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
        int result = Integer.MAX_VALUE;
        int max_value = 0;
        int indexOfMaxValue = 0;
        int lastIndexMaxValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (max_value < array[i]) {
                max_value = array[i];
                indexOfMaxValue = i+1;
            }
            for (int j = i; j < array.length; j++) {
                if(max_value == array[j]){
                    lastIndexMaxValue = j+1;
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
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
    }

//    public static void main(String[] args) {
//        int[] ints = {4, 100, 3, 4};
//        System.out.println(task2(ints));
//
//
//        int[] ints2 = {5, 50, 50, 4, 5};
//        System.out.println(task2(ints2));
//
//        int[] ints3 = {5, 350, 350, 4, 350};
//        System.out.println(task2(ints3));
//
//        int[] ints4 = {10, 10, 10, 10, 10};
//        System.out.println(task2(ints4));
//
//
//    }

}

