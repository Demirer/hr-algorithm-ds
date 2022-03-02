import com.hr_algorithm_ds.algorithm.HanoiTower;
import com.hr_algorithm_ds.algorithm.search.BinarySearch;
import com.hr_algorithm_ds.algorithm.sort.IndexBasedSort;
import com.hr_algorithm_ds.algorithm.sort.MergeSort;
import com.hr_algorithm_ds.algorithm.sort.QuickSort;
import org.assertj.core.internal.bytebuddy.matcher.MethodSortMatcher;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortAndSearchTest {

    private final MergeSort mergeSort = new MergeSort();

    private final QuickSort quickSort = new QuickSort();

    private final BinarySearch binarySearch = new BinarySearch();

    private final HanoiTower hanoiTower = new HanoiTower();

    private final IndexBasedSort indexBasedSort = new IndexBasedSort();


    @Test
    void testQuickSort() throws Exception {
        int[] testInput = {2,3,8,1,4,9,5,7,6};
        int[] expectedResult = {1,2,3,4,5,6,7,8,9};
        quickSort.quickSort(testInput,0,testInput.length-1);
        assertArrayEquals(expectedResult,testInput);
    }

    @Test
    void testMergeSort() throws Exception {
        int[] testInput = {2,3,8,1,4,9,5,7,6};
        int[] expectedResult = {1,2,3,4,5,6,7,8,9};
        mergeSort.mergeSort(testInput,testInput.length);
        assertArrayEquals(expectedResult,testInput);
    }

    @Test
    void testBinarySearch() throws Exception {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int indexOfResult = binarySearch.binarySearch(array,2,array[0],array[array.length-1]);
        assertEquals(1,indexOfResult);

    }

    @Test
    void testHanoiAlgorithm() throws Exception {
        int towerSize = 6;
        String baseRod = "Base Rod";
        String targetRod = "Target Rod";
        String middleRod =  "Middle Rod";
        hanoiTower.towerOfHanoi(towerSize,baseRod,targetRod,middleRod);
        assertTrue(true);
    }

    @Test
    void indexBasedSort() throws Exception {
        int[] testInput = {2,3,8,1,4,9,5,7,6};
        int[] expectedResult = {1,2,3,4,5,6,7,8,9};
        int[] result = indexBasedSort.indexBasedSort(testInput,testInput.length);
        assertArrayEquals(expectedResult,result);
    }
}

