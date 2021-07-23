package sorting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import java.util.ArrayList;
import java.util.Collections;

class CustomSortTest {
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
    void simpleCustomSortTest() {
        createInput(10);        
        CustomSort.sort(actual, 0, actual.length - 1, 12);
        assertArrayEquals(expected, actual);
    }

    @Test
    void advancedCustomSortTestk8() {
        createInput(10_000);        
        CustomSort.sort(actual, 0, actual.length - 1, 8);
        assertArrayEquals(expected, actual);
    }

    @Test
    void advancedCustomSortTestk12() {
        createInput(10_000);        
        CustomSort.sort(actual, 0, actual.length - 1, 12);
        assertArrayEquals(expected, actual);
    }

    @Test
    void seriousCustomSortTestk8() {
        createInput(1_000_000);        
        CustomSort.sort(actual, 0, actual.length - 1, 8);
        assertArrayEquals(expected, actual);
    }

    @Test
    void seriousCustomSortTestk15() {
        createInput(1_000_000);        
        CustomSort.sort(actual, 0, actual.length - 1, 15);
        assertArrayEquals(expected, actual);
    }

    @Test
    void seriousCustomSortTestk25() {
        createInput(1_000_000);        
        CustomSort.sort(actual, 0, actual.length - 1, 25);
        assertArrayEquals(expected, actual);
    }

    @Test
    void seriousCustomSortTestk12() {
        createInput(1_000_000);        
        CustomSort.sort(actual, 0, actual.length - 1, 12);
        assertArrayEquals(expected, actual);
    }

    @Test
    void seriousCustomSortTestk30() {
        createInput(1_000_000);        
        CustomSort.sort(actual, 0, actual.length - 1, 30);
        assertArrayEquals(expected, actual);
    }

    @Test
    void seriousCustomSortTestk40() {
        createInput(1_000_000);        
        CustomSort.sort(actual, 0, actual.length - 1, 40);
        assertArrayEquals(expected, actual);
    }

    @Test
    void seriousCustomSortTestk50() {
        createInput(1_000_000);        
        CustomSort.sort(actual, 0, actual.length - 1, 50);
        assertArrayEquals(expected, actual);
    }
}
