import com.hr_algorithm_ds.algorithm.search.BinarySearch;
import com.hr_algorithm_ds.algorithm.sort.MergeSort;
import com.hr_algorithm_ds.algorithm.sort.QuickSort;
import org.assertj.core.internal.bytebuddy.matcher.MethodSortMatcher;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortAndSearchTest {

    private final MergeSort mergeSort = new MergeSort();

    private final QuickSort quickSort = new QuickSort();

    private final BinarySearch binarySearch = new BinarySearch();


    @Test
    void testQuickSort() throws Exception {
        int[] testInput = {2,3,8,1,4,9,5,7,6};
        int[] expectedResult = {1,2,3,4,5,6,7,8,9};
        quickSort.quickSort(testInput,testInput[0],testInput[testInput.length-1]);
        assertEquals(expectedResult,testInput);
    }

    @Test
    void testMergeSort() throws Exception {
        //TODO: IMPLEMENT TEST
    }

    @Test
    void testBinarySearch() throws Exception {
        //TODO: IMPLEMENT TEST
    }

    @Test
    void testHanoiAlgorithm() throws Exception {
      //TODO: IMPLEMENT TEST
    }
}

