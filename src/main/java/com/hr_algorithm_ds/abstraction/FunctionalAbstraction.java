package com.hr_algorithm_ds.abstraction;

import java.util.List;
import java.util.Locale;
import java.util.function.*;

public class FunctionalAbstraction {

    public void biConsumerBasic(List<String> messages){
        Consumer<List<String>> consumerFunction = val -> val.forEach(System.out::println);
        consumerFunction.accept(messages);
    }

    public boolean biPredicateBasic(Integer number){
        Predicate<Integer> predicateFunction = val -> val>20;
        return predicateFunction.test(number);
    }

    public String  biFunctionBasic(String firstString, String secondSting){
        BiFunction<String,String,String> function = this::combineWordsForbiFunctionBasic;
        return function.apply(firstString,secondSting);
    }

    private String combineWordsForbiFunctionBasic(String firstString, String secondSting) {
        return firstString + " AND ALSO " + secondSting;
    }

    public boolean booleanSupplierBasic(String str) {
        Supplier<Boolean> booleanSupplier = () -> str.length() == 5;
        return booleanSupplier.get();
    }

    public Integer intSupplierBasic(String str) {
        Supplier<Integer> integerSupplier = () -> str.length() + 15;
        return integerSupplier.get();
    }

    public String stringSupplierBasic(String str) {
        Supplier<String> stringSupplier = () -> str.toUpperCase(Locale.ROOT);
        return stringSupplier.get();
    }
}
