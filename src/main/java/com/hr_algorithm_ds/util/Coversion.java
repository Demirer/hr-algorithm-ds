package com.hr_algorithm_ds.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Coversion {

    public static List<Integer> convertIntArrayToArrayList (int[] intArray){
        final List<Integer> intArrayList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        return intArrayList;
    }
}
