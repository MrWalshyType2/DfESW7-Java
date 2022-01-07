package com.qa.exercises.fizzbuzz;

public class FizzBuzz {

	public String play(int input) {
		if ((input % 5 == 0) && (input % 3 == 0)) {
			return "FizzBuzz";
		} else if (input % 5 == 0) {
			return "Fizz";
		} else if (input % 3 == 0) {
			return "Buzz";
		} else {
			return null;
		}
	}
}
