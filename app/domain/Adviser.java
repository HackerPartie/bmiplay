package domain;

public class Adviser {

/**
 * Assess in which category a person is
 */
	
	public static String assessCategory (Person person) {
		if (person.bmi < 15)
			return "Very severely underweight";
		else if (person.bmi < 16)
			return "Severely underweight";
		else if (person.bmi < 18.5)
			return "Underweight";
		else if (person.bmi < 25)
			return "Normal";
		else if (person.bmi < 30)
			return "Overweight";
		else if (person.bmi < 35)
			return "Slightly obese";
		else
			return "Obese";
	}
	
	public static String adviceWeight (Person person) {
		if (person.bmi > 30) {
			return "TODO";
		}
		else if (person.bmi < 18.5 ) {
			return "TODO";			
		}
		else return "";
	}
}
