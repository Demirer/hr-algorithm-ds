import com.hr_algorithm_ds.cci.CCIModerateAlgorithm;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CCIModereteAlgorithmTest {

    private final CCIModerateAlgorithm cciModerateAlgorithm = new CCIModerateAlgorithm();

    @Test
    void numberSwapperTest() throws Exception {
        List<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(3);
        final List<Integer> result = cciModerateAlgorithm.numberSwapper(testList);
        assertEquals(3,result.get(0));
        assertEquals(5,result.get(1));
    }

    @Test
    void wordFrequencies() throws Exception {
        Scanner scanner = new Scanner(new FileReader("src/test/resources/CCIModereteAlgorithm16-2Test.txt"));
        Scanner scannerRes = new Scanner(new FileReader("src/test/resources/CCIModereteAlgorithm16-2Res.txt"));

        int firstResult = Integer.parseInt(scannerRes.nextLine());
        int secondResult = Integer.parseInt(scannerRes.nextLine());

        StringBuilder stringBuilder = new StringBuilder();
        while(scanner.hasNext()){
            stringBuilder.append(scanner.nextLine());
        }

        int resultOne = cciModerateAlgorithm.wordFrequencies("UniqueWordForTestSearch",stringBuilder.toString());
        int resultTwo = cciModerateAlgorithm.wordFrequencies("UniqueWordForTestSearch2",stringBuilder.toString());

        assertEquals(firstResult,resultOne);
        assertEquals(secondResult,resultTwo);
    }
}
