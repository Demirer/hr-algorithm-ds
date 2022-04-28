package com.hr_algorithm_ds.util;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

@Slf4j
public class StringTokenize {

    @Data
    static class KeyData{
        private String metricName;
        private String date;
        private String metricData;

        KeyData(String metricName,String date, String metricData){
            this.metricName = metricName;
            this.date = date;
            this.metricData = metricData;
        }
    }

    private final String localDateNow = LocalDateTime.now().toString();

    private List<String> mockMetricData(){
        List<String> mockData = new ArrayList<>();
        mockData.add("key-A,"+localDateNow+",14");
        mockData.add("key-A,"+localDateNow+",5");
        mockData.add("key-A,"+localDateNow+",18");
        mockData.add("key-B,"+localDateNow+",2");
        mockData.add("key-B,"+localDateNow+",1");
        mockData.add("key-B,"+localDateNow+",129");
        mockData.add("key-C,"+localDateNow+",0");
        mockData.add("key-C,"+localDateNow+",1");
        mockData.add("key-C,"+localDateNow+",10");
        return mockData;
    }

    public List<KeyData> tokenizeKeyValues(){
        List<String> ketData = mockMetricData();
        List<KeyData> result = new ArrayList<>();

        for (String element : ketData){
            StringTokenizer tokenizer = new StringTokenizer(element, ",");
            KeyData keyData = new KeyData(tokenizer.nextToken().replace(" ", ""),tokenizer.nextToken().replace(" ", ""),tokenizer.nextToken().replace(" ", ""));
            result.add(keyData);
        }
        log.info(result.toString());
        return result;
    }
}
