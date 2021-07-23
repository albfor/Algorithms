package sorting;

public class MergeSort {
    public static void sort(int[] input) {
        sort(input, 0, input.length - 1);
    }
    private static void sort(int[] input, int start, int end) {
        if (start < end) {
            int m = start + (end - start) / 2;
            sort(input, start, m);
            sort(input, m + 1, end);
            merge(input, start, m, end);
        }
    }

    static void merge(int[] input, int start, int middle, int end) {
        int n1 = middle - start + 1;
        int n2 = end - middle;
        int[] startToMiddle = new int[n1];
        int[] middleToEnd = new int[n2];
        // Copies the left half into L and the right half into R
        System.arraycopy(input, start, startToMiddle, 0, n1);
        System.arraycopy(input, middle + 1, middleToEnd, 0, n2);

        int i = 0, j = 0;
        int k = start;

        while (i < n1 && j < n2) {
            if (startToMiddle[i] <= middleToEnd[j]) {
                input[k] = startToMiddle[i];
                i++;
            } else {
                input[k] = middleToEnd[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            input[k] = startToMiddle[i];
            i++;
            k++;
        }

        while (j < n2) {
            input[k] = middleToEnd[j];
            j++;
            k++;
        }
    }
}

