package org.j2eedev.test.junit;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

import org.junit.Test;
/**
 * 
 * @author Umashankar
 * http://j2eedev.org
 */
public class ExpectingExceptionsTest {
    
	/**
	 * callling a method on null reference, expected NullPointerException
	 */
	@Test(expected=NullPointerException.class)
	public void expectExceptionTest1(){
		String name=null;
		String firstName=name.substring(0,8);
	}
	/**
	 * accessing array index out of bounds, expected ArrayIndexOutOfBoundsException
	 */
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void expectExceptionTest2(){
		String[] languages=new String[]{"Java","Scala","Groovy"};
		String clojure=languages[3];
	}
	/**
	 * Accessing non existent file, expected NoSuchFileException
	 * @throws Exception
	 */
	@Test(expected=NoSuchFileException.class)
	public void expectExceptionTest3()throws Exception{
		Files.size(Paths.get("/path/to/non-existent-file.txt"));
	}
	
}