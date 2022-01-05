package com.qa.hello_world;

import com.qa.data_types.Fraction;

// classes represent components
public class Runner {

	// only one main method per project
	// - methods represent behaviours
	// - methods belong to a class
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		// java.lang is a package imported into EVERY java file
		// System is a class
		// println() is a method
		java.lang.System.out.println();
		
		// 'a'
		// 32.3
		// false
		Fraction f = new Fraction();
		f.numerator = 10;
		System.out.println(f.numerator);
	}

	// a package is a logical grouping for classes (it's a folder/directory that contains the java files)
}
