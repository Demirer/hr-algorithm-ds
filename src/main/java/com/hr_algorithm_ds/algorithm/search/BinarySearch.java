package com.hr_algorithm_ds.algorithm.search;

public class BinarySearch {
    public int binarySearch(int[] sortedArray, int element, int low, int high) {
        int middle = low  + ((high - low) / 2);
        if (high < low) {return -1;}
        if (element == sortedArray[middle]) {
            return middle;
        } else if (element < sortedArray[middle]) {
            return binarySearch(sortedArray, element, low, middle - 1);
        } else {
            return binarySearch(sortedArray, element, middle + 1, high);
        }
    }
}
