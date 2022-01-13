package com.hr_algorithm_ds.algorithm;

import com.hr_algorithm_ds.constant.HrAlgorithmDsConstant;
import com.hr_algorithm_ds.util.Coversion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BiggerIsGreater {

    public static String biggerIsGreater(String w) {
        char[] chars = w.toCharArray();
        int i= chars.length-1;
        while(i>0){
            if(chars[i-1]>=chars[i]){
                i--;
            }else{
                int j=i;
                while(j<chars.length&&chars[j]>chars[i-1]){
                    j++;
                }
                char temp = chars[i-1];
                chars[i-1]=chars[j-1];
                chars[j-1]=temp;

                char[] newChar = new char[chars.length];
                for(int k=0;k<i;k++){
                    newChar[k]=chars[k];
                }
                int end = chars.length-1;
                for(int k=i;k<chars.length;k++){
                    newChar[k]=chars[end--];
                }
                return new String(newChar);
            }
        }
        return "no answer";
    }
}
