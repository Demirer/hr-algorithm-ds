import com.hr_algorithm_ds.algorithm.BiggerIsGreater;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BiggerIsGreaterTest {

    private final BiggerIsGreater biggerIsGreater = new BiggerIsGreater();

    @Test
    void biggerIsGreaterTest() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/test/resources/BiggerIsGreaterTest.txt"));
        BufferedReader bufferedReaderRes = new BufferedReader(new FileReader("src/test/resources/BiggerIsGreaterRes.txt"));

        int T = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> result = new ArrayList<>();
        List<String> outputs = new ArrayList<>();

        IntStream.range(0, T).forEach(TItr -> {
            try {
                String w = bufferedReader.readLine();
                String r = biggerIsGreater.biggerIsGreater(w);
                outputs.add(r);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        IntStream.range(0, T).forEach(FItr -> {
            try {
                String q = bufferedReaderRes.readLine();
                result.add(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        assertEquals(result,outputs);
        bufferedReader.close();
        bufferedReaderRes.close();
    }
}
