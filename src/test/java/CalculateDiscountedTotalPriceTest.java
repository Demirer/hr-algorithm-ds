import com.hr_algorithm_ds.algorithm.CalculateDiscountedTotalPrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class CalculateDiscountedTotalPriceTest {

    private final CalculateDiscountedTotalPrice calculateDiscountedTotalPrice = new CalculateDiscountedTotalPrice();
    @Test
    void calculateDiscountedTotalPriceTest() throws IOException {

        Scanner testScanner = new Scanner(new FileReader("src/test/resources/CalculateDiscountedTotalPriceTest.txt"));
        Scanner resultScanner = new Scanner(new FileReader("src/test/resources/CalculateDiscountedTotalPriceRes.txt"));

        Integer result = resultScanner.nextInt();
        List<Integer> inputSetList = new ArrayList<>();
        int discountRate = 37;
        while(testScanner.hasNext()){
            inputSetList.add(testScanner.nextInt());
        }
        final Integer output = calculateDiscountedTotalPrice.calculateDiscountedTotalPrice(inputSetList,discountRate);
        Assertions.assertEquals(result,output);
    }
}
