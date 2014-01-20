package domain;

public class Adviser {

/**
 * Assess in which category a person is
 * 
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
	
	public static boolean assessWeightProblem (Person person) {
		if (person.bmi < 18.5 || person.bmi > 25 ) 
			return true;
		else 
			return false;
	}
	
	public static double adviceWeight (Person person) {
		if (person.bmi > 25) {
			return  Person.roundOff(person.size * person.size * 25);
		}
		else if (person.bmi < 18.5 ) {
			 return  Person.roundOff(person.size * person.size * 18.5);			
		}
		else return 0.0;
	}
	
	public static double adviceSize (Person person) {
		if (person.bmi > 25) {
			return  Person.roundOff(Math.sqrt(person.weight/25));
		}
		else if (person.bmi < 18.5 ) {
			 return  Person.roundOff(Math.sqrt(person.weight/18.5));			
		}
		else return 0.0;
	}
}
