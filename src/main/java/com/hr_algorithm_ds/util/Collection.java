package com.hr_algorithm_ds.util;

import java.util.List;

public class Collection {

    List<Integer> removeAllDuplicates(List<Integer> list, Integer element) {
        int index;
        while ((index = list.indexOf(element)) >= 0) {
            list.remove(index);
        }
        return list;
    }
}
