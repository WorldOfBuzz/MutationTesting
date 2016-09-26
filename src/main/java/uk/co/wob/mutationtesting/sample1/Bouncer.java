package uk.co.wob.mutationtesting.sample1;

/**
 * https://blog.codecentric.de/en/2016/02/sensible-mutation-testing-dont-go-killing-spree-2/
 * 
 *
 */
public class Bouncer {
	enum Gender {
		MALE, FEMALE;
	}

	public boolean welcome(int age, Gender gender) {
		if (gender == Gender.FEMALE) {
			return age >= 18;
		} else
			return age >= 21;
	}
}
