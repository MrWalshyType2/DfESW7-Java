package com.qa.exercises;

public class Runner {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Results results = new Results();

//		System.out.println(calculator.divide(10, 4));
		results.physicsScore = 50;
		results.chemistryScore = 100;
		results.biologyScore = 2;
//		results.displayResults();
		results.displayPercentage();
	}

	// integer division truncates the result
	// - anything after the decimal point is removed
}
