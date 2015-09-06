package org.j2eedev.test.junit;

import org.junit.Test;

/**
 * 
 * @author Umashankar
 * http://j2eedev.org
 */
public class JUnitTimeoutTest {
	
	@Test(timeout=1000L)
	public void getAffiliateProductFeedTest(){
		//call to WebService 
		//should respond WebService with in some time limit.
		
	}
	@Test(timeout = 1000L)  
	public void infinityTest() {
		//Un commenting below line would cause test to fail because of never ending infinite loop
		//while (true);  
	}  
}
