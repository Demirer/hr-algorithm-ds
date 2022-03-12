package com.hr_algorithm_ds.util;

import java.util.List;

public class Permutation {

    private static List<String> permutationReturn(String prefix, String str, List<String> tmpList) {
        int n = str.length();
        if (n == 0) tmpList.add(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutationReturn(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),tmpList);
        }
        return tmpList;
    }
}
