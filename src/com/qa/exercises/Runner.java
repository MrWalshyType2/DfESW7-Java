package com.qa.exercises;

public class Runner {

	public static void main(String[] args) {
		// calculator is locally scoped to main
		Calculator calculator = new Calculator();
		// @fj89wj
		Results results = new Results();
		// @94rjh9
//		System.out.println(calculator.divide(10, 4));
		results.physicsScore = 50;
		results.chemistryScore = 100;
		results.biologyScore = 2;
//		results.displayResults();
		results.displayPercentage();
		
//		System.out.println(s);
		// can't access s outside of someMethod()
		int i = 2;
		// i would be stored on the stackframe for main
	}

	// integer division truncates the result
	// - anything after the decimal point is removed
	
	public static void someMethod() {
		// 's' is scoped to someMethod
		// - it is only accessible inside this method
		// - 's' is said to have a local/method scope
		String s = "hello";
		//@jfd98
	}
}
