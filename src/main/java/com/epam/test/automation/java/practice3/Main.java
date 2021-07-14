package com.epam.test.automation.java.practice3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int[] task1(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            // swap numbers
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
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



    }

