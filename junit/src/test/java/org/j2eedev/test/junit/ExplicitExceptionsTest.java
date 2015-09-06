package org.j2eedev.test.junit;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

import org.junit.Test;
import static org.junit.Assert.fail;
public class ExplicitExceptionsTest {
  
	/**
	 * Wrong way of using expected, you never know whether the exception is from 
	 */
	@Test(expected=Exception.class)
	public void expectExceptionTest1()throws Exception{
		//Block1 : NullPointerException is expected
		Files.size(Paths.get("/path/to/non-existent-file.txt"));
		
		//Block2 : ArrayIndexOutOfBoundsException is expected.
		String[] languages=new String[]{"Java","Scala","Groovy"};
		String clojure=languages[3];
	}
	/**
	 * Right way of expecting exceptions in JUnit
	 * @throws Exception
	 */
	public void expectExceptionTest2()throws Exception{
		//Block1 : NullPointerException is expected
	    try {
			Files.size(Paths.get("/path/to/non-existent-file.txt"));
			fail();
		} catch (NoSuchFileException e) {
			// OK. test pass
			
		}
				
	    //Block2 : ArrayIndexOutOfBoundsException is expected.
		try {
			String[] languages=new String[]{"Java","Scala","Groovy"};
			String clojure=languages[3];
			fail();
		} catch (ArrayIndexOutOfBoundsException e) {
			//  OK. test pass
		}
	}
}
