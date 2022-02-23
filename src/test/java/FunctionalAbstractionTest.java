import com.hr_algorithm_ds.abstraction.FunctionalAbstraction;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class FunctionalAbstractionTest {

    private final FunctionalAbstraction functionalAbstraction = new FunctionalAbstraction();

    @Test
    void biConsumerBasicTest(){
        List<String> messageList = new ArrayList<>();
        messageList.add("Hello");
        messageList.add("World");
        functionalAbstraction.biConsumerBasic(messageList);
    }

    @Test
    void biPredicateBasicTest(){
        final int testValueTrue = 30;
        assertTrue(functionalAbstraction.biPredicateBasic(testValueTrue));
    }

    @Test
    void biFunctionBasicTest(){
        String firstString = "Hello";
        String secondString = "World";
        String result = functionalAbstraction.biFunctionBasic(firstString,secondString);
        assertEquals("Hello AND ALSO World",result);
    }

    @Test
    void booleanSupplierBasicTest(){
        String firstString = "Hello";
        boolean result = functionalAbstraction.booleanSupplierBasic(firstString);
        assertTrue(result);
    }

    @Test
    void intSupplierBasicTest(){
        String firstString = "Hello";
        int result = functionalAbstraction.intSupplierBasic(firstString);
        assertEquals(20,result);
    }

    @Test
    void stringSupplierBasicTest(){
        String firstString = "Hello";
        String result = functionalAbstraction.stringSupplierBasic(firstString);
        assertEquals("HELLO",result);
    }
    @Test
    void test(){
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(4);
        arr.add(2);
        arr.add(2);
        arr.add(8);

        List<Integer> result = new ArrayList<>();
        while(!arr.isEmpty()){
            int min = Collections.min(arr);
            int cuts =0;
            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, arr.get(i)-min);
                cuts++;
            }
            arr = removeAll(arr,0);
            result.add(cuts);
        }
        System.out.println(result);
    }

    List<Integer> removeAll(List<Integer> list, Integer element) {
        int index;
        while ((index = list.indexOf(element)) >= 0) {
            list.remove(index);
        }
        return list;
    }


    public int calculateListForIndexSequence(List<Integer> numbers){
        int result = 0;
        for(Integer number : numbers){
            result += number;
        }
        return result;
    }
}
