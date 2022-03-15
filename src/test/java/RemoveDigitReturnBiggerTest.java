import com.hr_algorithm_ds.algorithm.RemoveDigitReturnBigger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class RemoveDigitReturnBiggerTest {

    private final RemoveDigitReturnBigger removeDigitReturnBigger = new RemoveDigitReturnBigger();

    @Test
    void testRemoveForBigger() throws FileNotFoundException {
        Scanner testScanner = new Scanner(new FileReader("src/test/resources/RemoveDigitReturnBiggerTest.txt"));
        Scanner resultScanner = new Scanner(new FileReader("src/test/resources/RemoveDigitReturnBiggerRes.txt"));

        List<Integer> inputs = new ArrayList<>();
        List<Integer> results = new ArrayList<>();
        while(testScanner.hasNext()){
            inputs.add(testScanner.nextInt());
        }
        while(resultScanner.hasNext()){
            results.add(resultScanner.nextInt());
        }

        List<Integer> output = inputs.stream().map(i -> removeDigitReturnBigger.removeForBigger(i, 5)).toList();

        Assertions.assertEquals(results,output);
    }
}
