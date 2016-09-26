package uk.co.wob.mutationtesting.sample2;

/**
 * http://blog.xebia.com/mutation-testing-how-good-are-your-unit-tests/
 * 
 *
 */
public class NameParser {

	public Person findPersonWithLastName(String[] names, String lastNameToFind) {
		Person result = null;
		int numberOfNames = names.length;
		if (numberOfNames > 0){
			for(int i = 0; i <= numberOfNames; i++) { // bug 1 - ArrayOutOfBoundsException, ha a lastName.equals(lastNameToFind) feltétel egy inputon sem teljesül
				String[] parts = names[i].split(" ");
				String firstName = parts[0];
				String lastName = parts[1];
				if(lastName.equals(lastNameToFind)) {
					result = new Person(firstName, lastName);
					break;
				}
			}
		}
		return result;
	}
}
