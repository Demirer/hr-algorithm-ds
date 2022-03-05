package com.hr_algorithm_ds.algorithm.sort;

import java.util.Collections;
import java.util.List;

public class DashSort {

    /**
     * @param unsorted
     * @return Sorted BigInteger Values which greater than 10 pow 16
     */
    public List<String> dashSort(List<String> unsorted) {
        Collections.sort(unsorted, (x, y) ->
                x.length() == y.length()
                        ? x.compareTo(y)
                        : Integer.compare(x.length(), y.length()));
        return unsorted;
    }
}
