package domain;

public class Person {

	public double weight;	
	public double size; // in meters
	public double bmi;

	
	public Person(double weight, double size){
		this.weight = weight;
		this.size = size;
		this.bmi = this.calculateBodyMassIndex();
	}

	/**
	 *  private method to calculate the BMI during constructor call
	 * @return the body mass index.
	 */
	private double calculateBodyMassIndex(){
		return Utils.roundOff(weight / ((size) * (size)));
	}

}
