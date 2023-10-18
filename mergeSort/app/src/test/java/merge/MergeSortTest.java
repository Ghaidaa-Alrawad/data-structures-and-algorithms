package mergeSort.app.src.test.java.merge;

import mergeSort.app.src.main.java.merge.MergeSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    @Test
    public void testReverseSorted() {
        int[] arr = {20, 18, 12, 8, 5, -2};
        int[] expected = {-2, 5, 8, 12, 18, 20};
        MergeSort.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testFewUniques() {
        int[] arr = {5, 12, 7, 5, 5, 7};
        int[] expected = {5, 5, 5, 7, 7, 12};
        MergeSort.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testNearlySorted() {
        int[] arr = {2, 3, 5, 7, 13, 11};
        int[] expected = {2, 3, 5, 7, 11, 13};
        MergeSort.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }
}
