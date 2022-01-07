package com.qa.iteration.for_loops;

public class Runner {

	public static void main(String[] args) {
		// a for loop is used when we know how many times we want to execute some instructions
		// for (initialiser; termination_condition; increment) { // code to execute in here }
		
		// A for loop has a simple structure:
		// - the initialiser section allows us to create local variables used in the loop
		// - the termination_condition is a boolean expression indicating when the loop should terminate
		// - the increment section is where we increment the initialised local variables that indicate our iteration in the loop
		
		System.out.println("COUNT FROM 1 TO 10");
		// The following loop counts from 1 to 10 (inclusive)
		for (int i = 1; i <= 10; i++) {
			// the `int i = 1` instruction is executed ONCE just before the loop begins and never again
			// then the code in here runs
			System.out.println(i);
			
			// then 'i++' runs
			// then 'i <= 10' runs
			// then if the condition was true, the code in the body runs again
		}
		
		System.out.println("COUNT FROM 10 TO 1");
		// We can also count backwards by using a decrement
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		// The sections of a loop are not actually required
		// - for (;;;) {} is an infinite loop for example
		System.out.println("DROPPED SECTION FROM LOOP HEADER");
		int counter = 0;
		for (; counter <= 10; counter++) {
			System.out.println(counter);
		}
		
		// Loops can also be nested inside of each other
		// - this is useful for multi-dimensional arrays
		System.out.println("PRINT 0 TO 10 TEN TIMES");
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.println(j);
			}
		}
	}
}
