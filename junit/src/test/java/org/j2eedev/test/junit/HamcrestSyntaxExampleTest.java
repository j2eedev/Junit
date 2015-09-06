package org.j2eedev.test.junit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;

/**
 * 
 * @author Umashankar
 * http://j2eedev.org
 */
public class HamcrestSyntaxExampleTest {
	 
	
	@Test
	 public void hamcrestSyntaxTest() {
	   final Integer a = 400;
	   final Integer b = 100;
	   final String SCALA_SMALL="scala";
	   final String SCALA_CAPS="SCALA";
	   final String SCALA_WHITE_SPACE=" SCALA ";

	   assertThat(a, is(notNullValue()));
	   assertThat(a, is(equalTo(400)));
	   assertThat(a - b, is(greaterThan(0)));
	   
	   assertThat(SCALA_SMALL, is(equalToIgnoringCase(SCALA_CAPS)));
	   assertThat(SCALA_CAPS, is(equalToIgnoringWhiteSpace(SCALA_WHITE_SPACE)));
	  }
}
