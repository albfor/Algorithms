package sorting;

public class CustomSort {
    public static void sort(int[] input, int insertionSortSize) {
        sort(input, 0, input.length - 1, insertionSortSize);
    }

    private static void sort(int[] input, int start, int end, int insertionSortSize) {
        if (end - start < insertionSortSize) {
            InsertionSort.sort(input, start, end);
        } else if (start < end) {
            int middle = start + (end - start) / 2;
            sort(input, start, middle, insertionSortSize);
            sort(input, middle + 1, end, insertionSortSize);
            MergeSort.merge(input, start, middle, end);
        }
    }
}
