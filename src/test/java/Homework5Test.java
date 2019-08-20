import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Homework5Test {

    Homework5 homework5 = new Homework5();

    @Test
    public void testAllSidesTheSame()
    {
        assertEquals("YES", homework5.isTriangle(10, 10, 10));
    }

    @Test
    public void testImpossibleTriange()
    {
        assertEquals("NO", homework5.isTriangle(2, 2, 10));
    }

    @Test
    public void testZeroSide()
    {
        assertEquals("NO", homework5.isTriangle(0, 0, 0));
    }
}
