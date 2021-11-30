package major;

import static org.junit.jupiter.api.Assertions.*;

class MajorTest {
    Major major;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void major() {
        assertEquals(9, Major.major(new int[]{3,7,9,8}));
        assertEquals(9, Major.major(new int[]{9,7,8}));
        assertEquals(9, Major.major(new int[]{7,9,8}));
        assertEquals(9, Major.major(new int[]{7,8,9}));
        assertEquals(9, Major.major(new int[]{9,7,9,8}));
        assertEquals(7, Major.major(new int[]{7}));
        assertEquals(22, Major.major(new int[]{-4,-6,-7,22}));
        //assertEquals(9, Major.major(new int[]{}));
    }
}