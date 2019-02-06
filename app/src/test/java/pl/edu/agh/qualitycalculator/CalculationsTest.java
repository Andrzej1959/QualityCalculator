package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculationsTest {
    Calculations calculationsUnderTest;

    @Before
    public void setUp() {
        calculationsUnderTest = new Calculations();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(5, calculationsUnderTest.calculate(Operation.SUM, 2, 3), 0.01);
    }

    @Test
    public void testSub() throws Exception {
        assertEquals(-1, calculationsUnderTest.calculate(Operation.SUBTRACT, 2, 3), 0.01);
    }

    @Test
    public void testDiv() throws Exception {
        assertEquals(1.0001, calculationsUnderTest.calculate(Operation.DIVIDE, 2, 2), 0.01);
    }

    @Test
    public void testMul() throws Exception {
        assertEquals(6, calculationsUnderTest.calculate(Operation.MULTIPLY, 2, 3), 0.01);
    }

    @Test
    public void testAvg() throws Exception {
        assertEquals(4, calculationsUnderTest.calculate(Operation.AVG, 2, 3, 7), 0.01);
    }

    @Test
    public void testSumF() throws Exception {
        assertEquals(5, calculationsUnderTest.sum( 2, 3), 0.01);
    }
    @Test
    public void testSubF() throws Exception {
        assertEquals(-1, calculationsUnderTest.subtract( 2, 3), 0.01);
    }
    @Test
    public void testMulF() throws Exception {
        assertEquals(6, calculationsUnderTest.multiply( 2, 3), 0.01);
    }
    @Test
    public void testDivF() throws Exception {
        assertEquals(0.5, calculationsUnderTest.divide( 2, 4), 0.01);
    }
    @Test
    public void testAvgF() throws Exception {
        assertEquals(4, calculationsUnderTest.avg( 3, 4, 5), 0.01);
    }

    @After
    public void tearDown() {
    }
}
