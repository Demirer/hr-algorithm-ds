package com.hr_algorithm_ds.cci;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public int wordFrequencies(String searchWord, String book){
        searchWord = searchWord.trim().toLowerCase();
        String[] words = book.split(" ");
        Map<String,Integer> wordMap = new HashMap<>();
        for (String word : words) {
            word = word.trim().toLowerCase();
            if (!wordMap.containsKey(word)) {
                wordMap.put(word, 1);
            } else {
                wordMap.put(word, wordMap.get(word) + 1);
            }
        }
        return wordMap.get(searchWord);
    }
}
