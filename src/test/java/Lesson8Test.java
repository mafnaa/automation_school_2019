import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lesson8Test {

    @Test
    public void checkHappyPath() {
        Lesson8 practice = new Lesson8();
        assertEquals("4 5", practice.findCommonParts(1, 10, 3, 6));
    }

    @Test
    public void checkMatchingRange() {
        Lesson8 practice = new Lesson8();
        assertEquals("1 2 3 4 5 6 7 8 9", practice.findCommonParts(0, 10, 0, 10));
    }

    @Test
    public void checkNegativeRange() {
        Lesson8 practice = new Lesson8();
        assertEquals("-4 -3 -2", practice.findCommonParts(-10, 10, -5, -1));
    }

    @Test
    public void checkIncorrectRange() {
        Lesson8 practice = new Lesson8();
        assertEquals("ERROR", practice.findCommonParts(10, 5, -5, -1));
    }

    @Test
    public void checkIncorrectRange2() {
        Lesson8 practice = new Lesson8();
        assertEquals("ERROR", practice.findCommonParts(5, 15, -5, -11));
    }
}
