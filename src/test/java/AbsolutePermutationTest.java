import com.hr_algorithm_ds.algorithm.AbsolutePermutation;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsolutePermutationTest {

    private final AbsolutePermutation absolutePermutation = new AbsolutePermutation();

    @Test
    public void absolutePermutationTest() throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/test/resources/AbsolutePermutationTest.txt"));
        BufferedReader bufferedReaderRes = new BufferedReader(new FileReader("src/test/resources/AbsolutePermutationRes.txt"));


        int t = Integer.parseInt(bufferedReader.readLine().trim());
        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                String[] resMultipleInput = bufferedReaderRes.readLine().replaceAll("\\s+$", "").split(" ");
                List<String> successfulResult = Arrays.asList(resMultipleInput);
                List<Integer> successfulResultList = successfulResult.stream()
                        .map(Integer::valueOf)
                        .collect(Collectors.toList());

                int n = Integer.parseInt(firstMultipleInput[0]);
                int k = Integer.parseInt(firstMultipleInput[1]);
                List<Integer> result = absolutePermutation.absolutePermutation(n, k);
                assertEquals(successfulResultList,result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
        bufferedReaderRes.close();
    }
}
