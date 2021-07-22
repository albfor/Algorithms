public class InsertionSort {
    /**
     * Sorts the entire array
     */
    public static void sort(int[] input) {
        sort(input, 0, input.length - 1);
    }

    /**
     * Sorts between index l and r
     */
    public static void sort(int[] input, int l, int r) {
        for (int i = l + 1; i <= r; i++) {
            int key = input[i];
            int j = i - 1;

            while (j >= l && input[j] > key) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = key;
        }
    }
}
