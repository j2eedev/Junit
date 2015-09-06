package org.j2eedev.test.junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;

public class JUnitAssertionExamplesTest {
	
	private static final String SCALA="scala";
	private static final String GROOVY="groovy";
	private static final String JAVA="java";
	
	@Test
    public void assertionWithMessage() {
        final List<String> languages = new ArrayList<>();
        languages.add(SCALA);

        assertFalse("The languages list is not empty", languages.isEmpty());
    }

    @Test
    public void assertionWithoutMessage() {
    	final List<String> languages = new ArrayList<>();
        languages.add(GROOVY);

        assertTrue(languages.contains(GROOVY));
    }

    @Test
    public void assertionEquals() {
        assertEquals(2, 2);
    }
    @Test
    public void assertionNotEquals() {
    	assertNotEquals(1, 2);
    }
    @Test
    public void assertionFalse() {
    	assertFalse(Boolean.FALSE);
    }
    @Test
    public void assertionArrayEquals() {
    	final List<String> languages = new ArrayList<>();
    	languages.add(SCALA);
    	languages.add(GROOVY);
    	languages.add(JAVA);
    	
    	String[] langs=new String[]{SCALA,GROOVY,JAVA};
    	
    	assertArrayEquals(langs, languages.toArray());
    	
    }
}
