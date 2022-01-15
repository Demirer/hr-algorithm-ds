package com.hr_algorithm_ds.algorithm;

import java.awt.geom.RectangularShape;
import java.util.*;
import java.util.stream.Collectors;

public class AbsolutePermutation {

    public static List<Integer> absolutePermutation(int n, int k) {
        int ans[]=new int[n];
        int no[]={-1};
        int ok[]=new int[n];
        for(int i=0;i<n;i++)ok[i]=i+1;
        for(int i=0;i<n;i++)
        {
            int a=(i+1+k);
            int b=(i+1-k);
            if(b>=1 && b <=n && ok[b-1]!=-1)
            {
                ans[i]=b;
                ok[b-1]=-1;
            }
            else if(a>=1 && a<=n && ok[a-1]!=-1)
            {
                ans[i]=a;
                ok[a-1]=-1;
            }
            else{
                List<Integer> intArrayList = Arrays.stream(no).boxed().collect(Collectors.toList());
                return intArrayList;
            }
        }
        List<Integer> intArrayList = Arrays.stream(ans).boxed().collect(Collectors.toList());
        return intArrayList;
    }
}
