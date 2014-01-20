package domain;

public class AdviserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person testPerson = new Person(75,177);
		System.out.println("Random Guy" +" ");
		System.out.println(testPerson.bmi);
		System.out.println(Adviser.assessCategory(testPerson));
	}

}
