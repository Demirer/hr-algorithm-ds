package com.hr_algorithm_ds.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDigitReturnBigger {

    public Integer removeForBigger(Integer removalElement,Integer baseNumber){
        String baseNumberAsString = String.valueOf(baseNumber);
        String removalElementAsString = String.valueOf(removalElement);
        List<String> resultNumbers = new ArrayList<>();
        List<String> parsedBaseNumber = Arrays.stream(removalElementAsString.split("")).toList();
        for(int i = 0 ; i<parsedBaseNumber.size(); i++){
            if(parsedBaseNumber.get(i).equals(baseNumberAsString)){
                List<String> tmpList = new ArrayList<>(parsedBaseNumber);
                tmpList.remove(i);
                StringBuilder sb = new StringBuilder("");
                for (String element : tmpList) {
                    sb.append(element);
                }
                resultNumbers.add(sb.toString());
            }
        }
        Collections.sort(resultNumbers);
        return Integer.valueOf(resultNumbers.get(resultNumbers.size()-1));
    }
}
