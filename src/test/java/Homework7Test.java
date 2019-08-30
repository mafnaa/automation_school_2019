import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Homework7Test {

    private Homework7 homework7 = new Homework7();

    @Test
    void testHappyPath() {
        assertEquals(250, homework7.returnSum(3, 22));
    }

    @Test
    void testZeros() {
        assertEquals(0, homework7.returnSum(0, 0));
    }

    @Test
    void testStartNegative() {
        assertEquals(247, homework7.returnSum(-3, 22));
    }

    @Test
    void testBothNegative() {
        assertEquals(-54, homework7.returnSum(-10, -2));
    }

    @Test
    void testZeroLength() {
        assertEquals(25, homework7.returnSum(25, 25));
    }

    @Test
    void testWrongInput() {
        assertEquals(0, homework7.returnSum(14, 7));
    }
}
