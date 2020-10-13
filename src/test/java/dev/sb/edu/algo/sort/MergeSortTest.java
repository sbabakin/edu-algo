package dev.sb.edu.algo.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

    @Test
    void sort1() {
        int[] values = {2, 1, 4, 3, 6, 5};
        MergeSort.sort(values);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, values);
    }

    @Test
    void sort2() {
        int[] values = {10, 5, 0, -5, -10};
        MergeSort.sort(values);
        assertArrayEquals(new int[]{-10, -5, 0, 5, 10}, values);
    }
}