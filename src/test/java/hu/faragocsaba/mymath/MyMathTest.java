package hu.faragocsaba.mymath;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyMathTest {
    @Test
    public void testMyAdd_positiveResult() {
        assertEquals(5, MyMath.myAdd(3, 2));
    }

    @Test
    public void testMyAdd_negativeResult() {
        assertEquals(-5, MyMath.myAdd(-3, -2));
    }

    @Test
    public void testMySubtract_positiveResult() {
        assertEquals(3, MyMath.mySubtract(5, 2));
    }

    @Test
    public void testMySubtract_negativeResult() {
        assertEquals(-3, MyMath.mySubtract(2, 5));
    }
}
