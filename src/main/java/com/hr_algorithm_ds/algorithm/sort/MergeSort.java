package com.hr_algorithm_ds.algorithm.sort;

public class MergeSort {
    public void mergeSort(int[] a, int arraySize) {
        if (arraySize < 2) { return;}
        int mid = arraySize / 2;
        int[] l = new int[mid];
        int[] r = new int[arraySize - mid];
        System.arraycopy(a, 0, l, 0, mid);
        if (arraySize - mid >= 0) System.arraycopy(a, mid, r, 0, arraySize - mid);
        mergeSort(l, mid);
        mergeSort(r, arraySize - mid);
        merge(a, l, r, mid, arraySize - mid);
    }

    private static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
