import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InsertionSortTest {
    @Test
    void simpleSortTest() {
        int[] array = new int[] {5,2,6,3,1,4};
        InsertionSort.sort(array);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, array);
    }
}

