public final class AlgorithmsUtil {

    public static int[] quickSort(int left, int right, int[] toBeSorted) {
        if ((right-left+1) <= 1) { return toBeSorted; }

        toBeSorted = qsPartition(left, right, toBeSorted);

        return toBeSorted;
    }

    private static int[] qsPartition(int left, int right, int[] toBeSorted) {
        int pivot = toBeSorted[right];
        int j = left;
        for (int i=left; i<right; i++) {
            if (toBeSorted[i] < pivot) {
                swap(toBeSorted, j, i);
                j++;
            }
        }
        toBeSorted = swap(toBeSorted, j, right);

        toBeSorted = quickSort(left, j-1, toBeSorted);
        toBeSorted = quickSort(j+1, right, toBeSorted);

        return toBeSorted;
    }

    private static int[] swap(int[] arrayToSwap, int location1, int location2) {
        int holder = arrayToSwap[location1];
        arrayToSwap[location1] = arrayToSwap[location2];
        arrayToSwap[location2] = holder;

        return arrayToSwap;
    }

    public static int binarySearch(int[] toBeSearched, int target, int arrayLength) {
        return binarySearchRecursive(toBeSearched, target, 0, arrayLength-1);
    }

    private static int binarySearchRecursive(int[] toBeSearched, int target, int left, int right) {
        if (right-left < 0) {
            return -1;
        }
        int middle = (right-left+1)/2 + left;

        if (toBeSearched[middle] < target) {
            return binarySearchRecursive(toBeSearched, target, middle+1, right);
        }
        else if (toBeSearched[middle] > target) {
            return binarySearchRecursive(toBeSearched, target, left, middle-1);
        }
        return middle;

    }


}
