package in.mani.util;

import org.springframework.context.annotation.Configuration;

import in.mani.exception.ValidationException;

@Configuration
public class NumberValidator {

	/**
	 * This Method Checks the Number Whether it is Valid or Not
	 * 
	 * @param mobileNumber
	 */
	public static void isValidNumber(int number) {

		if (number == 0 || number < 0 || number > 2147483647) {
			throw new ValidationException("Number should not be Negative");
		}
	}
}
