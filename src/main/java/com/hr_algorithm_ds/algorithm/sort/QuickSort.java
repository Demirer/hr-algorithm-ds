package com.hr_algorithm_ds.algorithm.sort;

public class QuickSort {
    public void quickSort(int[] arr, int beginIndex, int endIndex) {
        if (beginIndex < endIndex) {
            int partitionIndex = partition(arr, beginIndex, endIndex);
            quickSort(arr, beginIndex, partitionIndex-1);
            quickSort(arr, partitionIndex+1, endIndex);
        }
    }
    private int partition(int[] arr, int beginIndex, int endIndex) {
        int pivot = arr[endIndex];
        int i = (beginIndex-1);

        for (int j = beginIndex; j < endIndex; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[endIndex];
        arr[endIndex] = swapTemp;
        return i+1;
    }
}
