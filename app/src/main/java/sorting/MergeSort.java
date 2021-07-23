package sorting;

public class MergeSort {
    public static void sort(int[] input, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(input, l, m);
            sort(input, m + 1, r);
            merge(input, l, m, r);
        }
    }

    static void merge(int[] input, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        System.arraycopy(input, l, L, 0, n1);
        int[] R = new int[n2];
        System.arraycopy(input, m + 1, R, 0, n2);
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
}

