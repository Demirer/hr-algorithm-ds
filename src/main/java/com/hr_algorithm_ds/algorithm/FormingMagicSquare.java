package com.hr_algorithm_ds.algorithm;

import java.util.ArrayList;
import java.util.List;

public class FormingMagicSquare {

    public int formingMagicSquare(List<List<Integer>> s) {
        int result = 100;
        int[][] finalPatterns = {{8, 1, 6, 3, 5, 7, 4, 9, 2},
                {4, 3, 8, 9, 5, 1, 2, 7, 6},
                {2, 9, 4, 7, 5, 3, 6, 1, 8},
                {6, 7, 2, 1, 5, 9, 8, 3, 4},
                {6, 1, 8, 7, 5, 3, 2, 9, 4},
                {8, 3, 4, 1, 5, 9, 6, 7, 2},
                {4, 9, 2, 3, 5, 7, 8, 1, 6},
                {2, 7, 6, 9, 5, 1, 4, 3, 8}};

        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inputList.add(s.get(i).get(j));
            }
        }

        for(int i =0; i<8 ;i++){
            int tmp =0;
            for (int j = 0; j < 9; j++) {
                Integer inputElement = inputList.get(j);
                if(finalPatterns[i][j] != inputElement){
                    tmp += Math.abs(finalPatterns[i][j]-inputElement);
                }
            }
            if(tmp<result){
                result=tmp;
            }
        }
        return result;
    }
}
