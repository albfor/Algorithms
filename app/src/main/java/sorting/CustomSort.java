public class CustomSort {
    public static void sort(int[] input, int l, int r, int sortSwapSize) {
        if (r - l < sortSwapSize) {
            insertionSort(input, l, r);
        } else if (l < r) {
            int m = l + (r - l) / 2;
            sort(input, l, m, sortSwapSize);
            sort(input, m + 1, r, sortSwapSize);
            merge(input, l, m, r); 
        }
    } 

    private static void insertionSort(int[] input, int l, int r) {
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

    private static void merge(int[] input, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = createTempArray(input, l, n1);
        int[] R = createTempArray(input, m + 1, n2);
        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                input[k] = L[i];
                i++;
            } else {
                input[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            input[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            input[k] = R[j];
            j++;
            k++;
        }
    }

    private static int[] createTempArray(int[] input, int start, int size) {
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = input[start + i];
        }
        return temp;
    }
}
