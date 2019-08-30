import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lesson6Test {


    @Test
    public void checkIsBirthday() {
        Lesson6 birthday = new Lesson6();
        assertEquals("Yes", birthday.isItMyBirthday(12, 1));
    }

    @Test
    public void checkNotBirthday() {
        Lesson6 birthday = new Lesson6();
        assertEquals("No", birthday.isItMyBirthday(1, 1));
    }

    @Test
    public void checkNotBirthday2() {
        Lesson6 birthday = new Lesson6();
        assertEquals("No", birthday.isItMyBirthday(12, 12));
    }

    @Test
    public void checkInvalidDate() {
        Lesson6 birthday = new Lesson6();
        assertEquals("Error", birthday.isItMyBirthday(12, 42));
    }

    @Test
    public void checkInvalidMonth() {
        Lesson6 birthday = new Lesson6();
        assertEquals("Error", birthday.isItMyBirthday(42, 12));
    }

    @Test
    public void checkNegativeDate() {
        Lesson6 birthday = new Lesson6();
        assertEquals("Error", birthday.isItMyBirthday(2, -12));
    }

    @Test
    public void checkNegativeMonth() {
        Lesson6 birthday = new Lesson6();
        assertEquals("Error", birthday.isItMyBirthday(-2, 1));
    }

    @Test
    public void checkZero() {
        Lesson6 birthday = new Lesson6();
        assertEquals("Error", birthday.isItMyBirthday(0, 0));
    }

    @Test
    public void checkInvalidMonthDate() {
        Lesson6 birthday = new Lesson6();
        assertEquals("Error", birthday.isItMyBirthday(2, 30));
        assertEquals("Error", birthday.isItMyBirthday(2, 31));
        assertEquals("Error", birthday.isItMyBirthday(4, 31));
        assertEquals("Error", birthday.isItMyBirthday(6, 31));
        assertEquals("Error", birthday.isItMyBirthday(9, 31));
        assertEquals("Error", birthday.isItMyBirthday(11, 31));
    }
}
