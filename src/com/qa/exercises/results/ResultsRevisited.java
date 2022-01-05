package com.qa.exercises.results;

public class ResultsRevisited {

	// track scores
	int physics; // /150
	int chemistry; // /150
	int biology; // /150

	int total;
	int percentage; // total * 100 / 450

	// display the results of physics chemistry and biology, and whether they passed or failed
	public void displayResults() {
		// delegate work to method
		String results = prepareResultsString();
		
		// print the returned result
		System.out.println(results);
	}

	public String prepareResultsString() {
		// calculate total score and percentage
		total = physics + chemistry + biology;
		percentage = (total * 100 / 450);

		// create initial output string
		String output = "PHYSICS: " + physics + "/150\n" // \n is newline character
				+ "CHEMISTRY: " + chemistry + "/150\n" + "BIOLOGY: " + biology + "/150\n" + "TOTAL: " + total
				+ "/450\n";


		// delegate the work of calculating an exam percentage to a method, reduces code duplication (DRY principle, Don't repeat yourself)
		int phyPercent = calculateExamPercentage(physics);
		int chePercent = calculateExamPercentage(chemistry);
		int bioPercent = calculateExamPercentage(biology);

		// if an if statement only has one instruction to run, you do not need to put curly braces around it
		// - appending diff. outputs here dependent on whether an exam was failed or not
		if (phyPercent < 60)
			output += "FAILED PHYSICS: " + phyPercent + "%\n";
		if (chePercent < 60)
			output += "FAILED CHEMISTRY: " + chePercent + "%\n";
		if (bioPercent < 60)
			output += "FAILED BIOLOGY: " + bioPercent + "%\n";

		// this if statement has more than 1 line of code for execution per branch, thus it requires curly braces
		// to signify a block of code
		if (percentage < 60 || phyPercent < 60 || chePercent < 60 || bioPercent < 60) {
			output += "FAILED: " + percentage + "%\n";
			return output;
		} else {
			output += "PASSED: " + percentage + "%\n";
			return output;
		}
	}

	// each exam has a max score of 150, returns the percentage of the exam based on the passed in marks
	public int calculateExamPercentage(int marks) {
		return marks * 100 / 150;
	}

	// The main method is in this file for example purposes, please do not replicate
	// this in your own code.
	public static void main(String[] args) {
		// create an instance
		ResultsRevisited results = new ResultsRevisited();

		// Set borderline values, decrement any by 1 to provide a fail
		results.biology = 90;
		results.physics = 90;
		results.chemistry = 90;

		// call the method to display the results
		results.displayResults();
	}
}
