package com.hr_algorithm_ds.cci;

import java.util.List;

public class CCIModerateAlgorithm {

    public List<Integer> numberSwapper(List<Integer> numbers){
        int a = numbers.get(0);
        int b = numbers.get(1);
        a = a-b;
        b = a+b;
        a = b-a;
        numbers.clear();
        numbers.add(a);
        numbers.add(b);
        return  numbers;
    }
}
