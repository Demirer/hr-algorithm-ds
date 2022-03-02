package com.hr_algorithm_ds.algorithm.sort;

public class IndexBasedSort {
    public int[] indexBasedSort(int[] a, int arraySize) {
        int[] result = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            int placeIndex = a[i];
            result[placeIndex-1] = placeIndex;
        }
        return result;
    }
}
