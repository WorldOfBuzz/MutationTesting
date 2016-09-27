package uk.co.wob.mutationtesting.sample1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import uk.co.wob.mutationtesting.sample1.Bouncer.Gender;

/**
 * Ez egy borzalmas unittest. 
 * 
 * @author janoszsolt
 *
 */
public class BouncerTest {
	
	private Bouncer bouncer;
	
	@Before
	public void setup(){
		this.bouncer = new Bouncer();
	}

	@Test
	public void test21YearOldMale() {
		boolean isTwentyTwoMaleWelcome = this.bouncer.welcome(22, Gender.MALE);
		
		boolean isTwentyMaleWelcome = this.bouncer.welcome(20, Gender.MALE);
		
		boolean isTwentyOneMaleWelcome = this.bouncer.welcome(21, Gender.MALE);
		
		/**
		 * Ez egy elég béna hiba :)
		 */
		//Assert.assertTrue(this.bouncer.welcome(22, Gender.MALE));
	}

	@Test
	public void test19YearOldFemale() {
		
		boolean isNineteenFemaleWelcome = this.bouncer.welcome(19, Gender.FEMALE);
		
		boolean isEightteenFemaleWelcome = this.bouncer.welcome(18, Gender.FEMALE);
		
		boolean isSeventeenFemaleWelcome = this.bouncer.welcome(17, Gender.FEMALE);
		
		/**
		 * Ez se sokkal jobb :(
		 */
		Assert.assertFalse(isSeventeenFemaleWelcome);
	}

}
