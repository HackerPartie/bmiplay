package domain;

public class Adviser {

	/**
	 * Assess in which category a person is
	 * 
	 */
	public final static double LOWER_NORMAL = 18.5;
	public final static double HIGHER_NORMAL = 25;

	public static String assessCategory(Person person) {
		if (person.bmi < 15)
			return "very severely underweight";
		else if (person.bmi < 16)
			return "severely underweight";
		else if (person.bmi < LOWER_NORMAL)
			return "underweight";
		else if (person.bmi < HIGHER_NORMAL)
			return "normal";
		else if (person.bmi < 30)
			return "overweight";
		else if (person.bmi < 35)
			return "slightly obese";
		else
			return "obese";
	}

	public static boolean assessWeightProblem(Person person) {
		return (person.bmi < LOWER_NORMAL || person.bmi > HIGHER_NORMAL);

	}

	public static String adviceWeight(Person person) {
		if (person.bmi > HIGHER_NORMAL) {
			double goodWeight = person.size * person.size * HIGHER_NORMAL;
			return String.format(
					"You should be around %d kg, for the size you have ...",
					(int) goodWeight);
		} else if (person.bmi < LOWER_NORMAL) {
			double goodWeight = Utils.roundOff(person.size * person.size
					* LOWER_NORMAL);
			return String.format(
					"You should be around %d kg, for the size you have ...",
					(int) goodWeight);
		} else
			return "";
	}

	public static String adviceSize(Person person) {
		if (person.bmi > HIGHER_NORMAL) {
			double goodSize = Math.sqrt(person.weight / HIGHER_NORMAL);
			return String.format(
					"Or you should grow to %d cm, for the weight you have :)",
					(int) (goodSize * Utils.CENTIMETERS));
		} else if (person.bmi < LOWER_NORMAL) {
			double goodSize = Math.sqrt(person.weight / LOWER_NORMAL);
			return String.format(
					"You should shrink to %d, for the weight you have :)",
					(int) goodSize);
		} else
			return "";
	}

}
