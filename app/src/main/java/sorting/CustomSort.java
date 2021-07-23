package sorting;

public class CustomSort {

    public static void sort(int[] input, int insertionSortSize) {
        sort(input, 0, input.length - 1, insertionSortSize);
    }

    private static void sort(int[] input, int startIndex, int endIndex, int insertionSortSize) {
        if (endIndex - startIndex < insertionSortSize) {
            InsertionSort.sort(input, startIndex, endIndex);
        } else if (startIndex < endIndex) {
            int middle = startIndex + (endIndex - startIndex) / 2;
            sort(input, startIndex, middle, insertionSortSize);
            sort(input, middle + 1, endIndex, insertionSortSize);
            MergeSort.merge(input, startIndex, middle, endIndex);
        }
    }
}
