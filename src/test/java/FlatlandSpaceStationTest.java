import com.hr_algorithm_ds.algorithm.FlatlandSpaceStations;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlatlandSpaceStationTest {

    private final FlatlandSpaceStations flatlandSpaceStations = new FlatlandSpaceStations();

    @Test
    void flatlandSpaceStationTest() throws Exception{
        Scanner scanner = new Scanner(new FileReader("src/test/resources/FlatlandSpaceStationsTest.txt"));
        Scanner scannerRes = new Scanner(new FileReader("src/test/resources/FlatlandSpaceStationsRes.txt"));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] c = new int[m];

        int successfulTestResult = scannerRes.nextInt();

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations.flatlandSpaceStations(n, c);
        assertEquals(successfulTestResult,result);
        scanner.close();
    }
}
