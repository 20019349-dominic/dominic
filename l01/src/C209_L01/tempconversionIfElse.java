/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * dominic, 21/4/2021 1106
 */

package C209_L01;

/**
 * @author 20019349
 *
 */

public class tempconversionIfElse {

	public static void main(String[] args) {
		double celsius = 0.0;
		double fahrenheit = 0.0;
		String msg = null;
		
		System.out.println(" 1. Convert Celsius to Fahrenheit ");
		System.out.println(" 2. Convert Fahrenheit to Celsius ");
		int option = Helper.readInt("Enter an option: ");
		
		if (option == 1) {
			celsius = Helper.readDouble(" Enter a temperature in celsius > ");
			fahrenheit = (celsius * 1.8) + 32;
			msg = String.format("%.2f degree celsius is %.2f  calsius fahrenheit", celsius, fahrenheit);
		System.out.println(msg);
		}else if (option == 2) {
			fahrenheit = Helper.readDouble("Enter a temperature in fahrenheit - ");
			celsius = (fahrenheit - 32 ) / 1.8;
			msg = String.format("%.2f degree fahrenhei is %.2f  degree celsius", fahrenheit, celsius);
		System.out.println(msg);	
		}else {
				System.out.println("Invalid option");
			}
	}
}
			






