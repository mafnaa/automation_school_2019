import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Homework6Test {

    private Homework6 homework6 = new Homework6();

    @Test
    void testTriangle1() {
        assertEquals("43", homework6.calculateArea("triangle", 10, 10, 10));
    }

    @Test
    void testInvalidTriangle() {
        assertEquals("Wrong triangle", homework6.calculateArea("triangle", 2, 3, 10));
    }

    @Test
    void testTriangleWithFractionalSide() {
        assertEquals("1.8", homework6.calculateArea("triangle", 2, 2, 3.34));
    }

    @Test
    void testTriangleWithTypo() {
        assertEquals("Wrong type", homework6.calculateArea("triangled", 10, 10, 10));
    }

    @Test
    void testRectangle1() {
        assertEquals("100.00", homework6.calculateArea("rectangle", 10, 10, 0));
    }

    @Test
    void testRectangleNegative() {
        assertEquals("-24.00", homework6.calculateArea("rectangle", 3, -8, 0));
    }

    @Test
    void testRectangleZeros() {
        assertEquals("0.00", homework6.calculateArea("rectangle", 0, 0, 0));
    }

    @Test
    void testRectangleFractionalValues() {
        assertEquals("3.39", homework6.calculateArea("rectangle", 7.7, 0.44, 0));
    }

    @Test
    void testCircle() {
        assertEquals("398.82", homework6.calculateArea("circle", 11.27, 0, 0));
    }


    @Test
    void testCircleZero() {
        assertEquals("0.00", homework6.calculateArea("circle", 0, 0, 0));
    }
}
