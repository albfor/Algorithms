public class CustomSort {
    public static void sort(int[] input, int l, int r, int insertionSortSize) {
        if (r - l < insertionSortSize) {
            InsertionSort.sort(input, l, r);
        } else if (l < r) {
            int m = l + (r - l) / 2;
            sort(input, l, m, insertionSortSize);
            sort(input, m + 1, r, insertionSortSize);
            MergeSort.merge(input, l, m, r); 
        }
    } 
}
