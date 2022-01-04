package com.qa.operators;

public class Runner {

	public static void main(String[] args) {
		// Assignment
		// - placing a value into a variable
		// - performed right to left
		// - = symbol is used for assignment
		int x = 3;
		String s = "hello";
		
		// Arithmetic operators
		// - follows the BIDMAS/BODMAS/PEMDAS model of order of operations
		// - + for addition, - for subtraction, / for division, * for multiplication, % for modulo
		// - performed left to right
		int y = 3 + 3; // 6
		int z = 3 * 3; // 9
		int division = 9 / 3; // 3
		
		// modulo operation returns the remainder of a division
		// - returned as a whole number (int)
		int r = 9 % 2; // 1
		System.out.println(r);
			
		// Compound assignment
		// *=, /=, -=, +=, %=
		int accumulator = 15;
		int input = 24;
//		accumulator = accumulator + input; // 39 = 15 + 24
		accumulator += input; // 39
		System.out.println(accumulator);
		
		// Concatenation
		// - the joining of two strings to create a new string
		// - uses the additive operator
		String greeting = "Good morning";
		String name = "Bob";
		
		String greetPerson = greeting + " " + name;
		System.out.println(greetPerson);
	}

}
