package com.hr_algorithm_ds.algorithm.search;

public class BinarySearch {
    //FIXME: NOT WORK
    public int binarySearch(int[] sortedArray, int key, int low, int high) {
        int middle = low  + ((high - low) / 2);
        if (high < low) {return -1;}
        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return binarySearch(
                    sortedArray, key, low, middle - 1);
        } else {
            return binarySearch(
                    sortedArray, key, middle + 1, high);
        }
    }
}
