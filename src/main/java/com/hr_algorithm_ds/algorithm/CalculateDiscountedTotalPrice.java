package com.hr_algorithm_ds.algorithm;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CalculateDiscountedTotalPrice {

    public int calculateDiscountedTotalPrice(List<Integer> shopList, Integer discountRate){
        double total = 0;
        int maxElement = Collections.max(shopList);
        boolean discountUsed = false;
        Optional<Double> discountedMAX = shopList.stream().max(Integer::max).map(s -> Double.valueOf((s/100F)*(100F-discountRate)));
        for (Integer element : shopList){
            if(element == maxElement && !discountUsed){total = total + discountedMAX.get(); discountUsed=true;}
            else{total += Double.valueOf(element);}
        }
        return (int) Math.floor(total);
    }
}
