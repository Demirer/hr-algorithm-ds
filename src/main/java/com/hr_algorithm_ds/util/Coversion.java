package com.hr_algorithm_ds.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Coversion {

    public static  int[] convertArrayListToIntArray(List<Integer> integerArrayList){
        return integerArrayList.stream().mapToInt(i -> i).toArray();
    }

    public static List<Integer> convertIntArrayToArrayList (int[] intArray){
        return Arrays.stream(intArray).boxed().collect(Collectors.toList());

    }

    public static  List<String> convertStringArrayToStringArrayList (String[] stringArray){
        return Arrays.asList(stringArray);

    }

    public static  String[] convertStringArrayListToStringArray(List<String> stringList){
        return stringList.toArray(new String[stringList.size()]);
    }
}
