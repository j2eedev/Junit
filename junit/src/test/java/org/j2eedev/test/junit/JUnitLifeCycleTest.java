package org.j2eedev.test.junit;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;


/***
 * 
 * @author Umashankar
 * j2eedev.org
 */
public class JUnitLifeCycleTest {

    private static int counter = 0;
    /**
     * testSuiteSetup()
     * Executed only once for set of tests, would normally call them as testSuite
     */
    @BeforeClass
    public static void testSuiteSetup() {
        assertEquals(0, counter);
        counter++;
    }
    /**
     * New JUnitLifeCycle instance is created for each test in the class
     * e.g Class contains two tests and creates two JUnitLifeCycle objects to invoke tests.
     */
    public JUnitLifeCycleTest() {
        assertTrue(Arrays.asList(1, 5).contains(counter));
        counter++;
    }
    /**
     * Before executing each setup testSetup() will be executed.
     * Would normally write seed data or initialization setup code that is needed to execute test here.
     */
    @Before
    public void testSetup() {
        assertTrue(Arrays.asList(2,6).contains(counter));
        counter++;
    }
    /**
     * Performs actual test with your assertions.
     */
    @Test
    public void peformFirstTest() {
        assertTrue(Arrays.asList(3, 7).contains(counter));
        counter++;
    }

    @Test
    public void performSecondTest() {
        assertTrue(Arrays.asList(3, 7).contains(counter));
        counter++;
    }
    /**
     * Cleanup for each test
     */
    @After
    public void cleanupTest() {
        assertTrue(Arrays.asList(4, 8).contains(counter));
        counter++;
    }
    /**
     * Cleanup code that you want to write after complete testSuite executes.
     */
    @AfterClass
    public static void testSuiteFinished() {
        assertEquals(9, counter);
    }
    
}
