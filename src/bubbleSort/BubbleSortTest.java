package bubbleSort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    void ascTest() {
        assertArrayEquals(new double[]{-1,0,1,2,8}, bubbleSort.asc(new double[]{0,2,8,1,-1}));
    }

    @Test
    void descTest() {
        assertArrayEquals(new double[]{8,2,1,0,-1}, bubbleSort.desc(new double[]{0,2,8,1,-1}));
    }

    @Test
    void duplicateTest(){
        assertAll("bubbleSort",
                () -> assertArrayEquals(new double[]{-1,0,1,2,8}, bubbleSort.asc(new double[]{0,2,8,1,-1})),
                () -> assertArrayEquals(new double[]{-1,0,1,2,8}, bubbleSort.asc(new double[]{0,2,8,1,-1}))
        );
    }

    @Test
    void nullTest(){
        assertNull(new double[]{Double.parseDouble(null), Double.parseDouble(null), Double.parseDouble(null)});
    }

    @AfterEach
    void tearDown() {
    }
}