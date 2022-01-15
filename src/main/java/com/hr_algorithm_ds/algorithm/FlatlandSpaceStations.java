package com.hr_algorithm_ds.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FlatlandSpaceStations {

    public int flatlandSpaceStations(int n, int[] c) {
        int max = 0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < n; i++) {
            int optimalDist = Math.abs(c[0]-i);
            for (int j = 0; j < c.length; j++) {
                if(Math.abs(c[j] - i)<optimalDist){
                    optimalDist = Math.abs(c[j] - i);
                }
            }
            if(max<optimalDist){
                max=optimalDist;
            }
        }
        return max;
    }
}