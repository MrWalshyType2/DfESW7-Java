package com.qa.exercises.results;

public class Results {
	
	// fields have a class scope
	// - they can be accessed anywhere inside this class

	// exam scores
	public int physicsScore;
	public int chemistryScore;
	public int biologyScore;
	
	public int totalScore;
	public int percentage;
	
	public void displayResults() {
		totalScore = physicsScore + chemistryScore + biologyScore;
		System.out.println("PHYSICS:");
		// \t is a tab symbol
		// \n is the newline character
		// the '\' is an escape character
		System.out.println("\t" + physicsScore);
		System.out.println("CHEMISTRY:");
		System.out.println("\t" + chemistryScore);
		System.out.println("BIOLOGY:");
		System.out.println("\t" + biologyScore);

		System.out.println("\nEXAM SCORE: " + totalScore + "/450");
	}
	
	public void displayPercentage() {
		displayResults();
		percentage = totalScore * 100 / 450;
		System.out.println("PERCENTAGE: " + percentage + "%");
	}
}
