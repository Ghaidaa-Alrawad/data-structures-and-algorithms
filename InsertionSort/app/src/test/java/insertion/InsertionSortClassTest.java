package InsertionSort.app.src.test.java.insertion;

import InsertionSort.app.src.main.java.insertion.InsertionSortClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class InsertionSortClassTest {
    @Test
    public void testReverseSorted() {
        try {
            int[] arr = {20, 18, 12, 8, 5, -2};
            int[] expected = {-2, 5, 8, 12, 18, 20};

            InsertionSortClass insertionSort = new InsertionSortClass();
            insertionSort.insertionSort(arr);

            assertArrayEquals(expected, arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFewUniques() {
        try {
            int[] arr = {5, 12, 7, 5, 5, 7};
            int[] expected = {5, 5, 5, 7, 7, 12};

            InsertionSortClass insertionSort = new InsertionSortClass();
            insertionSort.insertionSort(arr);

            assertArrayEquals(expected, arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNearlySorted() {
        try {
            int[] arr = {2, 3, 5, 7, 13, 11};
            int[] expected = {2, 3, 5, 7, 11, 13};

            InsertionSortClass insertionSort = new InsertionSortClass();
            insertionSort.insertionSort(arr);

            assertArrayEquals(expected, arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
