package dev.sb.edu.algo.sort;

import java.util.Arrays;

/**
 * Simple merge-sort implementation.
 * Code is not optimized in order to transparently reflect the algorithm logic.
 */
public class MergeSort {

    public static void main(String[] args) {
        MergeSort.sort(new int[]{1, 10, 5, 9, 2, 1, 4, 8, -3});
    }

    public static void sort(int[] values) {
        System.out.println(">> " + Arrays.toString(values));
        sort(values, new int[values.length], 0, values.length - 1);
    }

    private static void sort(int[] values, int[] temp, int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = (left + right) / 2;
        sort(values, temp, left, middle); // sort left run
        sort(values, temp, middle + 1, right); // sort right run

        mergeSort(values, temp, left, middle, right);
    }


    private static void mergeSort(int[] values, int[] temp, int left, int middle, int right) {
        System.out.println(">> [" + left + "-" + middle + "-" + right + "]");

        int idx = left;
        int idx1 = left;
        int idx2 = middle + 1;

        while (idx1 <= middle && idx2 <= right) {
            if (values[idx1] <= values[idx2]) {
                temp[idx] = values[idx1];
                idx1++;
            } else {
                temp[idx] = values[idx2];
                idx2++;
            }
            idx++;
        }

        // copy leftovers from left side
        while (idx1 <= middle) {
            temp[idx] = values[idx1];
            idx1++;
            idx++;
        }

        // copy leftovers from right side
        while (idx2 <= right) {
            temp[idx] = values[idx2];
            idx2++;
            idx++;
        }

        System.out.println("T: " + Arrays.toString(temp));
        // transfer to destination array
        for (int i = left; i <= right; i++) {
            values[i] = temp[i];
        }
        System.out.println("V: " + Arrays.toString(values));
    }
}
