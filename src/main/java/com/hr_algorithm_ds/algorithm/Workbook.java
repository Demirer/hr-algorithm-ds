package com.hr_algorithm_ds.algorithm;

import java.util.List;

public class Workbook {

    public int workbook(int n, int k, List<Integer> arr) {
        int result = 0;
        int page = 1;

        // chapter
        for (int i = 0; i < arr.size(); i++) {
            int problems = arr.get(i);
            // problems
            for (int problem = 1; problem <= problems; problem++) {
                if (problem == page) {
                    result++;
                }
                if ((problem % k == 0) || problem == problems) {
                    page++;
                }
            }
        }
        return result;
    }
}

