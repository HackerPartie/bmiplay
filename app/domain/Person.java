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
			
	public String getBmiAsString() {
		return Double.toString(bmi);
	}

	/**
	 *  private method to calculate the BMI during constructor call
	 * @return the body mass index.
	 */
	private double calculateBodyMassIndex(){
		return roundOff(weight / ((size) * (size)));
	}
	
	/**
	 *  static method to keep only one digit after the comma
	 * @param pDouble
	 * @return
	 */
	public static double roundOff(double pDouble) {
		return Math.round(pDouble * 10.0) / 10.0;
	}
		
	/**
	 * Static method to calculate the BodyMassIndex, using only String as Input and Output
	 * just in case ...
	 * @param weight
	 * @param size
	 * @return
	 */
	public static String getBodyMassIndex(String weight, String size) {
		final double doubleWeight = Double.valueOf(weight) ;
		final double doubleSize = Double.valueOf(size);
		
		Person tempPerson = new Person(doubleWeight, doubleSize);
		return  tempPerson.getBmiAsString(); 
		
	}
}
