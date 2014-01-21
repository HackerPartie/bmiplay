package domain;

/**
 * 
 * @author manu
 * just some nice to have constants and general purpose utilities
 */
public class Utils {
	public static final int CENTIMETERS = 100;
	
	/**
	 *  static method to keep only one digit after the comma
	 * @param pDouble
	 * @return
	 */
	public static double roundOff(double pDouble) {
		return Math.round(pDouble * 10.0) / 10.0;
	}
}
