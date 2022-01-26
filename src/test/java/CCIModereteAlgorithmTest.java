import com.hr_algorithm_ds.cci.CCIModerateAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CCIModereteAlgorithmTest {

    private final CCIModerateAlgorithm cciModerateAlgorithm = new CCIModerateAlgorithm();

    @Test
    public void numberSwapperTest() throws Exception {
        List<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(3);
        final List<Integer> result = cciModerateAlgorithm.numberSwapper(testList);
        assertEquals(3,result.get(0));
        assertEquals(5,result.get(1));
    }
}
