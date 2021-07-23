package sorting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.ArrayList;
import java.util.Collections;

class InsertionSortTest {
    private int[] sorted;
    private int[] shuffled;

    private void createInput(int size) {
        ArrayList<Integer> integers = new ArrayList<>(size);
        for (int i = 1; i < size; i++) {
            integers.add(i);
        }
        sorted = integers.stream().mapToInt(i -> i).toArray();
        Collections.shuffle(integers);
        shuffled = integers.stream().mapToInt(i -> i).toArray();
    }

    @Test
    void simpleSortTest() {
        createInput(10);
        InsertionSort.sort(shuffled);
        assertArrayEquals(sorted, shuffled);
    }

    @Test
    void advancedTest() {
        createInput(10_000);
        InsertionSort.sort(shuffled);
        assertArrayEquals(sorted, shuffled);
    }

    @Disabled
    @Test 
    void seriousTest() {
        createInput(1_000_000);
        InsertionSort.sort(shuffled);
        assertArrayEquals(sorted, shuffled);
    }
}

