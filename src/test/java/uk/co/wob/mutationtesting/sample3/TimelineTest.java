package uk.co.wob.mutationtesting.sample3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * http://www.codeaffine.com/2015/10/05/what-the-heck-is-mutation-testing/
 * 
 */
public class TimelineTest {

	private Timeline timeline;

	@Before
	public void setUp() {
		timeline = new Timeline();
	}
	
	@Test
	public void setFetchCount() {
		int expected = 5;
		timeline.setFetchCount(expected);
		int actual = timeline.getFetchCount();
		Assert.assertEquals(expected, actual);

	}

	@Test(expected = IllegalArgumentException.class)
	public void setFetchCountWithNonPositiveValue() {
		timeline.setFetchCount(-1); //hibás teszt: nem teszteli edge-caset 
	}
	
	
	
}
