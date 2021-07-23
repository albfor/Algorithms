package sorting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;

class MergeSortTest {
    private int[] expected;
    private int[] actual;

    private void createInput(int size) {
        ArrayList<Integer> integers = new ArrayList<>(size);
        for (int i = 1; i < size; i++) {
            integers.add(i);
        }
        expected = integers.stream().mapToInt(i -> i).toArray();
        Collections.shuffle(integers);
        actual = integers.stream().mapToInt(i -> i).toArray();
    }

    @Test
    void simpleMergeSortTest() {
        createInput(10);        
        MergeSort.sort(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }

    @Test
    void advancedMergeSortTest() {
        createInput(10_000);        
        MergeSort.sort(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }

    @Test
    void seriousMergeSortTest() {
        createInput(1_000_000);        
        MergeSort.sort(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }
}
