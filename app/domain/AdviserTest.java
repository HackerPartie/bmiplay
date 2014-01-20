package domain;

public class AdviserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person(90,1.72);
		System.out.println("Random Guy" +" ");
		System.out.println(person.bmi);
		System.out.println(Adviser.assessCategory(person));
		System.out.println(Adviser.adviceSize(person));
		System.out.println(Adviser.adviceWeight(person));
	}

}
