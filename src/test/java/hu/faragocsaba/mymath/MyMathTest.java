package hu.faragocsaba.mymath;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyMathTest {
    @Test
    public void testAddPositive() {
        assertEquals(5, MyMath.myAdd(3, 2));
    }

    @Test
    public void testAddNegative() {
        assertEquals(-6, MyMath.myAdd(-3, -2));
    }
}
