import com.hr_algorithm_ds.algorithm.TheBombermanGame;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheBomberManTest {


    private final TheBombermanGame theBombermanGame = new TheBombermanGame();

    @Test
    public void theBomberManTest() throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/test/resources/TheBomberManTest.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int r = Integer.parseInt(firstMultipleInput[0]);
        int c = Integer.parseInt(firstMultipleInput[1]);
        int n = Integer.parseInt(firstMultipleInput[2]);

        List<String> grid = IntStream.range(0, r).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());


        BufferedReader bufferedReaderRes = new BufferedReader(new FileReader("src/test/resources/TheBomberManRes.txt"));
        List<String> gridRes = IntStream.range(0, r).mapToObj(i -> {
                    try {
                        return bufferedReaderRes.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = theBombermanGame.bomberMan(n, grid);

        assertEquals(gridRes, result);
    }
}
