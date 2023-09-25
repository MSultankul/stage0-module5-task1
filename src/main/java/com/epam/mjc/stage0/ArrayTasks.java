package com.epam.mjc.stage0;

import java.util.Arrays;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    public int[] generateNumbers(int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public int totalSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public String[] reverseArray(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - i - 1];
        }
        return result;
    }

    public int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num > 0) {
                result[index++] = num;
            }
        }
        return result;
    }

    public int[][] sortRaggedArray(int[][] arr) {
        // Sort the array based on lengths
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length > arr[j].length) {
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Sort the numbers within each array
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        return arr;
    }
}
