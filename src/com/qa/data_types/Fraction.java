package com.qa.data_types;

// a class is a blueprint
// - we can create many unique instances (fractions) from this blueprint

// a class can only be public or package-private
public class Fraction {

	// fields hold data describing the instance
	// - fields have a default value
	// - integer fields default to 0
	
	// 'public' is an access modifier
	// - access modifiers define how accessible something is
	public int numerator;
	public int denominator;
	
	// Method
	// - a self-contained behaviour/piece of functionality
	// - void means the method returns nothing (no output)
	// - the method does not have any parameters (inputs)
	public void printInfo() {
		// method body
		System.out.println(numerator + "/" + denominator);
	}
	
	// method that takes inputs
	// - method has 1 formal parameter of type int
	public void addToNumerator(int i) {
		// i is a local variable, it is local to this methods body
		numerator += i;
	}
	
	// methods that return outputs
	// - this method outputs a string
	public String getInfo() {
		// the 'return' keyword signifies some value to be returned/outputted
		return numerator + "/" + denominator;
	}
	
	// 'Fraction' is the return type
	// - multiply the name
	// - we take an input of type Fraction and store it in a variable called fraction
	public Fraction multiply(Fraction fraction) {
		// create a new fraction to store the result
		Fraction output = new Fraction();
		// set the new fractions numerator to the result of this objects numerator
		// multiplied by the input fractions numerator
		output.numerator = numerator * fraction.numerator;
		// set the new fractions denominator to the result of this objects denominator
		// multiplied by the input fractions denominator
		output.denominator = denominator * fraction.denominator;
		
		return output;
	}
}

// if you do not specify the public access modifier,
// it takes on the default of 'package-private'

// Fields and methods can have the following access modifiers:
// - public, default, protected, private