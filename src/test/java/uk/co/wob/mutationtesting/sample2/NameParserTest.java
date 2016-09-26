package uk.co.wob.mutationtesting.sample2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NameParserTest {

	private NameParser nameParser;
	private String[] names;

	@Before
	public void setUp() {
		nameParser = new NameParser();
		names = new String[]{"Mike Jones", "John Doe"};
	}

	@Test
	public void shouldFindPersonByLastName() {
		Person person = nameParser.findPersonWithLastName(names, "Doe");
		String firstName = person.getFirstName();
		String lastName = person.getLastName();
		
		/**
		 * Ismét, rossz a tesztünk
		 */
		
		Assert.assertEquals("John", firstName);
	}
	
//	@Test(expected=ArrayIndexOutOfBoundsException.class)
//	public void testArrayIndexOutOfBoundsExceptionBug() {
//		String[] inputToCauseException = new String[]{"Mike Jones", "John Doe"};
//		Person person = nameParser.findPersonWithLastName(names, "Kovács");
//	}
	
	@Test
	public void testEmptyInput() {
		String[] inputToCauseException = new String[]{};
		Assert.assertNull(nameParser.findPersonWithLastName(inputToCauseException, "Kovács"));
	}
	
}
