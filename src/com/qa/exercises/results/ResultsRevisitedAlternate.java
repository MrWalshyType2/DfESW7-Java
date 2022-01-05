package com.qa.exercises.results;

public class ResultsRevisitedAlternate {

	int physics; // /150
	int chemistry; // /150
	int biology; // /150

	int total;
	int percentage; // total * 100 / 450

	public void displayResults() {
		calculatePercentage();

		String output = "PHYSICS: " + physics + "/150\n" // \n is newline character
				+ "CHEMISTRY: " + chemistry + "/150\n" + "BIOLOGY: " + biology + "/150\n" + "TOTAL: " + total
				+ "/450\n";

		int chemistryPercentage = calculateExamPercentage(chemistry);
		int physicsPercentage = calculateExamPercentage(physics);
		int biologyPercentage = calculateExamPercentage(biology);

		if (physicsPercentage < 60)
			output += "FAILED PHYSICS: " + physicsPercentage + "%\n";
		if (chemistryPercentage < 60)
			output += "FAILED CHEMISTRY: " + chemistryPercentage + "%\n";
		if (biologyPercentage < 60)
			output += "FAILED BIOLOGY: " + biologyPercentage + "%\n";

		if (percentage < 60 || physicsPercentage < 60 || chemistryPercentage < 60 || biologyPercentage < 60) {
			output += "FAILED: " + percentage + "%\n";
			System.out.println(output);
		} else {
			output += "PASSED: " + percentage + "%\n";
			System.out.println(output);
		}
	}

	public void calculatePercentage() {
		total = physics + chemistry + biology;
		percentage = total * 100 / 450;
	}

	public int calculateExamPercentage(int score) {
		return score * 100 / 150;
	}

	// The main method is in this file for example purposes, please do not replicate
	// this in your own code.
	public static void main(String[] args) {
		ResultsRevisitedAlternate results = new ResultsRevisitedAlternate();

		// Borderline values, decrement any by 1 to provide a fail
		results.biology = 90;
		results.physics = 90;
		results.chemistry = 90;

		results.displayResults();
	}
}
