package com.qa.conditional.switchstatements;

public class Runner {

	public static void main(String[] args) {
		int i = 2;

		switch (i) {
		// cases fall through and execute after the first matching case
		// if we do not specify a break statement
		case 1: // is i == 1
			System.out.println("Monday");
			break; // stop the execution of the switch
		case 2: // is i == 2
			System.out.println("Tuesday");
			break;
		default:
			// the default case is executed if none of the other cases match
			System.out.println("Invalid input");
			break;
		}
		
		// switch statements work with:
		// - byte, short, int, char, String, Enums
		String day = "Monday";
		
		switch (day) {
		case "Monday":
			System.out.println("It is monday");
			break;
		}
	}

}
