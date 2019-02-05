package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class VerbalizerTest {

    CalculationsVerbalizer calculationsUnderTest;

    @Before
    public void setUp() {
        calculationsUnderTest = new CalculationsVerbalizer();
    }

    @Test
    public void testVerbSum() throws Exception {
        assertEquals("4.0 plus 3.0 gives value 7.0", calculationsUnderTest.verbalize(Operation.SUM, 4, 3, 7));
    }
    @Test
    public void testVerbSub() throws Exception {
        assertEquals("4.0 minus 4.0 gives value 0.0", calculationsUnderTest.verbalize(Operation.SUBTRACT, 4, 4, 0));
    }
    @Test
    public void testVerbMul() throws Exception {
        assertEquals("4.0 multiplied by 4.0 gives value 16.0", calculationsUnderTest.verbalize(Operation.MULTIPLY, 4, 4, 16));
    }
    @Test
    public void testVerbDiv() throws Exception {
        assertEquals("4.0 divided by 4.0 gives value 1.0", calculationsUnderTest.verbalize(Operation.DIVIDE, 4, 4, 1));
    }
    public void testVerbAvg() throws Exception {
        assertEquals("average of 3.0, 4.0, 5.0 gives value 4.0", calculationsUnderTest.verbalize(Operation.AVG, 3, 4, 5,4));
    }

    @After
    public void tearDown() {
    }

}
