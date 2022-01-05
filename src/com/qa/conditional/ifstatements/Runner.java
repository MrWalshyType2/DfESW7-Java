package com.qa.conditional.ifstatements;

public class Runner {

	public static void main(String[] args) {
		// conditional logic uses boolean values or expressions that evaluate to a boolean value
		
		// Equality operators
		// == (is equal to)
		// != (is not equal to)
		// IMPORTANT: When comparing values, they MUST BE of the same type
		boolean isRaining = false;
		
		// decision problem (yes or no)
		// - 1 of two branches of code that the program will follow
		if (isRaining == true) {
			System.out.println("It is raining");
		} else {
			// this will execute if isRaining is false
			System.out.println("It is not raining");
		}
		
		// equivalent to above
		// if (someBooleanIsTrue)
		if (isRaining) {
			System.out.println("It is raining");
		}
		
//		if (isRaining != true) {
//			System.out.println("It is not raining");
//		}
//		
//		// equivalent to above
//		if (!isRaining) {
//			System.out.println("It is not raining");
//		}
		
		// not a decision problem as there is more than two choices
		// - it is now a classification problem (meaning which category is the correct choice)
		int dayOfWeek = 92;
		
		if (dayOfWeek == 1) {
			System.out.println("It is Manic Monday!");
		} else if (dayOfWeek == 2) {
			System.out.println("It is Trumping Tuesday!");
		} else if (dayOfWeek == 3) {
			System.out.println("It is Wacky Wednesday!");
		} else if (dayOfWeek == 4) {
			System.out.println("It is Turkey Thursdays!");
		} else if (dayOfWeek == 5) {
			System.out.println("It is Freaky Friday!");
		} else if (dayOfWeek == 6) {
			System.out.println("It is Somber Saturday!");
		} else if (dayOfWeek == 7) {
			System.out.println("It is Sunday");
		} else {
			System.out.println("Unsupported value");
		}
		
		// Create a set of conditional statements that will output a catchy slogan dependent on the day
		// - this must cover the integer values 1 through 7 (inclusive)
		// - i.e., if day of week is 1, then the slogan printed would be "It is Manic Monday!"
		
		// Comparison operators
		// <, >, <=, >=
		int temperature = 15;
		
		if (temperature > 30) {
			System.out.println("It is too warm");
		} else if (temperature > 15) {
			System.out.println("It is just right");
		} else {
			// equivalent to 'else if (temperature <= 15)'
			System.out.println("It is too cold");
		}
		
		// Conditional operators
		// Logical (check both sides):
		// - OR |
		// - AND &
		boolean isSunny = true;
		
		// someMethod() will always get called in a logical OR or AND
		if (isSunny == true | someMethod() == true) {
			System.out.println("It is sunny");
		}
		
		if (isSunny == true & someMethod() == true) {
			System.out.println("It is sunny");
		}
	
		System.out.println("\nTHUNDERY EXAMPLE");
		boolean isThundery = true;
		// Short-circuit:
		// - OR (only checks the right operand if the left is false) ||
		// - AND (only checks the right operand if the left is true) &&
		
//		if (isThundery == true || someMethod() == true) {
//			System.out.println("It is thundery");
//		}
		
		if (isThundery == true && someMethod() == true) {
			System.out.println("It is thundery");
		}
		System.out.println("Continued execution");
	}

	public static boolean someMethod() {
		System.out.println("Ping");
		return false;
	}
}
