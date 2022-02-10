import com.hr_algorithm_ds.algorithm.FormingMagicSquare;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FormingMagicSquareTest {

    private final FormingMagicSquare formingMagicSquare = new FormingMagicSquare();

    @Test
    void formingMagicSquareTest() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("src/test/resources/FormingMagicSquareTest.txt"));
        Scanner scannerRes = new Scanner(new FileReader("src/test/resources/FormingMagicSquareRes.txt"));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            s.add(
                    Stream.of(scanner.nextLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList())
            );
        });

        int output = formingMagicSquare.formingMagicSquare(s);
        int trueResult = scannerRes.nextInt();

        scanner.close();
        scannerRes.close();

        assertEquals(trueResult, output);
    }
}
