package com.qa.data_types;

public class Runner {

	public static void main(String[] args) {
		// EVERYTHING IS CASE SENSITIVE!
		
		// EVERY COMPLETE INSTRUCTION MUST END WITH A SEMI-COLON
		// - semi-colon is the delimiter that indicates the end of a java instruction
		
		// Variable declaration
		// DataType variableName;
		int x; // declared a variable of type 'int' with the name 'x'
		
		// Variable initialisation
		// variableName = value;
		x = 3;
		
		System.out.println(x);
		
		// Variable declaration and initialisation on one line
		// DataType variableName = value;
		int z = 43;
		// I have declared a variable of type int, called z, which stores the value of 43
		
		// Primitive types
		// - basic building blocks
		// - DO NOT have methods/behaviours
		// - they do have reference type equivalents
		
		// Numerical (whole number/integer types)
		// - when you write a whole number, it will default to an integer
		// - this conversion happens using type casting
		byte b = 3; // 3 is of type int by default, it gets downcast/converted (narrowed its type) to a byte by Java
		
		// line 37 is equivalent to line 34
		byte b2 = (byte) 3; // typecasting
		
		short s = 5;
		int i = 7;
		long l = 82340932892L; // widen the int
		
//		System.out.println(Integer.MAX_VALUE);
		
		// Numerical (decimal number/floating-point types)
		// - decimal numbers default to a double
		float f = 3.14f;
		double d = 3.14;
		double d2 = 3.14d;
		
		// Non-numerical types
		char c = 'A'; // holds a single alphanumeric character, or UTF-8 char, MUST BE SURROUNDED BY SINGLE QUOTES
		char c2 = 65 + 32; // 'A' is the value 65
		System.out.println(c2);
		
		boolean bool = true; // can be true or false
		
		
		// Reference types
		// - all classes are reference types
		// - reference types have state (fields, data describing them) and behaviours (methods, that act on the state)
		String greeting = "Hello"; // a String is a sequence/array of chars
		
		// Strings are immutable, methods do not change the data inside them
		// - .toUpperCase() below returns a new String rather than the old one converted to uppercase
		System.out.println(greeting); // Hello
		System.out.println(greeting.toUpperCase()); // HELLO
		System.out.println(greeting); // Hello
		
		greeting = "World";
		System.out.println(greeting);
		
		// String is a class
		// - a class is a blueprint
		// - each string created from that blueprint is called an "instance/object"
		// - strings can be declared using a string literal inside double quotes
		String farewells = "Bye byee";
		// farewells and greeting are two different String objects
		
		// explicit declaration of a string
		// - the 'new' keyword signifies a new object is being created
		String anotherOne = new String("Some other string");
		System.out.println(anotherOne);
		
		Fraction myFraction = new Fraction();
		Fraction myFraction2 = new Fraction();
		Fraction myBackupReference = myFraction;
		System.out.println(myFraction);
		System.out.println(myFraction2);
		System.out.println(myBackupReference);
		
		// fields on a class instance can be accessed using dot notation
		myFraction.numerator = 3;
		myFraction.denominator = 6;
		
		System.out.println(myFraction.numerator); // 3
		System.out.println(myFraction2.numerator); // 0
	}

}
