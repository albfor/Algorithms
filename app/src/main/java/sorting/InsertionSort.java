package sorting;

public class InsertionSort {
    /**
     * Sorts the entire array
     */
    public static void sort(int[] input) {
        sort(input, 0, input.length - 1);
    }

    /**
     * Sorts between index start and end
     */
    public static void sort(int[] input, int startIndex, int endIndex) {
        for (int i = startIndex + 1; i <= endIndex; i++) {
            int key = input[i];
            int j = i - 1;

            while (j >= startIndex && input[j] > key) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = key;
        }
    }
}
