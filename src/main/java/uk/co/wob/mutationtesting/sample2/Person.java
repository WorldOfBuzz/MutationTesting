package uk.co.wob.mutationtesting.sample2;

public class Person {
	private final String firstName;
	private final String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return firstName; // bug 2- copypaste
	}
}
