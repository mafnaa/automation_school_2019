import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Homework4Test {
    @BeforeAll
    private static void init() {
        System.out.println("Shout in the console!");
    }

    @Test
    void testMultiplyTwoByTwo() {
        assertEquals(6, Homework4.multiply(2, 3));
    }

    @Test
    void testMultiplyOnZero() {
        assertEquals(0, Homework4.multiply(55, 0));
    }

    @AfterAll
    private static void endo() {
        System.out.println("This is the end.");
    }
}
