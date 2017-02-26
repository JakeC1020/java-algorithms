import org.junit.Test;

import static org.junit.Assert.*;

public class AlgorithmsUtilTest {
    @Test
    public void simpleQuickSort() {
        int[] toBeSorted = new int[]{8, 3, 4, 1};
        int[] sortedArray = new int[]{1, 3, 4, 8};
        int[] afterQS = AlgorithmsUtil.quickSort(0, 3, toBeSorted);
        assertArrayEquals(sortedArray, afterQS);
    }

    @Test
    public void emptyQuickSort() {
        int[] toBeSorted = new int[0];
        int[] sortedArray = new int[0];
        int[] afterQS = AlgorithmsUtil.quickSort(0,0,toBeSorted);
        assertArrayEquals(sortedArray, afterQS);
    }

    @Test
    public void binarySearchMiddle() {
        int[] toBeSearched = new int[]{1, 3, 4, 5, 6, 9, 20, 47, 10000};
        int foundIndex = AlgorithmsUtil.binarySearch(toBeSearched, 6, 9);
        assertEquals(4, foundIndex);
    }

    @Test
    public void binarySearchEdge() {
        int[] toBeSearched = new int[]{1, 3, 4, 5, 6, 9, 20, 47, 10000};
        int foundIndex = AlgorithmsUtil.binarySearch(toBeSearched, 1, 9);
        assertEquals(0, foundIndex);
    }

    @Test
    public void binarySearchNotFound() {
        int[] toBeSearched = new int[]{1, 3, 4, 5, 6, 9, 20, 47, 10000};
        int foundIndex = AlgorithmsUtil.binarySearch(toBeSearched, 42, 9);
    }

    @Test
    public void binarySearchEmpty() {
        int[] toBeSearched = new int[]{};
        int foundIndex = AlgorithmsUtil.binarySearch(toBeSearched, 0, 0);
        assertEquals(-1, foundIndex);
    }

}