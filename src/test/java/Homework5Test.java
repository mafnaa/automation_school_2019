import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Homework5Test {

    private Homework5 homework5 = new Homework5();

    @Test
    void testAllSidesTheSame() {
        assertEquals("YES", homework5.isTriangle(10, 10, 10));
    }

    @Test
    void testImpossibleTriange() {
        assertEquals("NO", homework5.isTriangle(2, 2, 10));
    }

    @Test
    void testZeroSide() {
        assertEquals("NO", homework5.isTriangle(0, 0, 0));
    }
}
