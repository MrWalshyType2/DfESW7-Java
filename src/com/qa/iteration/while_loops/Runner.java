package com.qa.iteration.while_loops;

public class Runner {

	public static void main(String[] args) {
		// A while loop is a simple loop that executes based off of a boolean expression, it is used to
		// repeat instructions of code multiple times.
		// - we generally use while loops when we don't know when the execution might stop
		//
		// while (someBooleanExpressionIsTrue) {
		//   execute this code
		// }
		
		// The following example sets up a counter to print from 0 to 10 (exclusive)
		int i = 0;
		
		// while keyword is required to indicate a while loop
		// - boolean expression is 'i < 10' as it will either evaluate to true or false
		while (i < 10) { // runs the check first, if false it will not execute the loop body
			System.out.println(i); // if i was less than 10, then print i
			i++; // increment i by one
		}
		
		// A standard while-loop may never actually execute
		boolean inPlay = false;
		while (inPlay == true) {
			System.out.println("Game is playing"); // never gets executed
		}
		
		// The loop above does not have a way to exit if it starts running, this would cause an infinite loop
		// which would execute forever (well, until we run out of memory which may or may not occur dependent on the code)
		inPlay = true;
		String userInput = "q";
		while (inPlay == true) {
			System.out.println("Game is playing");
			
			// added a conditional check on user input
			if (userInput == "q") {
				// if they entered 'q', break out of the loop
				break;
			}
		}
		// execution resumes here when the loop finishes
		
		
		
		// Do-While loops
		// - a do-while loop executes at least once
		// - the exit condition denoted by a boolean expression occurs at the end instead now
		inPlay = false;
		do {
			// do this code
			System.out.println("Game in play");
		} while (inPlay == true);
		// The loop above will print "Game in play" once and then exit as inPlay is false
	}

}
