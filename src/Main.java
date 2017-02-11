public class Main {

    public static void main(String[] args) {
        int[] testArray = {4, 5, 9, 7, 14, 29, 1, 14, 57, 3};
        int[] sortedArray = AlgorithmsUtil.quickSort(0, 9, testArray);

        for (int i=0; i<10; i++) {
            System.out.println(sortedArray[i]);
        }

        int testIndex = AlgorithmsUtil.binarySearch(sortedArray, 42, 10);

        System.out.println(testIndex);

    }
}
