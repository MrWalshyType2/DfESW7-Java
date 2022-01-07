package com.qa.arrays.single_dimension;

public class Runner {

	public static void main(String[] args) {
		// an array is a data structure (reference type) that can hold multiple pieces of data
		// - these pieces of data are held contiguously in memory (one after the other)
		// - arrays are fixed in size once created
		// - arrays start counting from 0
		
		// EXAMPLE:
		// Memory address | @j9r8 | @j098 | @jr84   |
		// Stored value   | "hi"  | "bye" | "hello" |
		// Index          | 0     | 1     | 2       |
		
		// Declaring and initialising an array
		// - specify square brackets after the data type to indicate what you would like to store in the array
		Object[] heterogenousArray = new Object[10]; // can store diff. data types, up to a max of 10 elements
		String[] homogenousArray = new String[10]; // can only store Strings, up to a max of 10 elements
		
		// The two arrays above are declared using reference types, this means the elements will be set to null
		System.out.println(homogenousArray[0]); // null
		
		// Elements are accessed using their index (position)
		// - the first element is at position 0
		// - the last element is at position list.length - 1
		homogenousArray[0] = "Hello"; // setting the value in the array at position 0 as "Hello"
		homogenousArray[homogenousArray.length - 1] = "Bye"; // setting the last value in the array as "Bye" at index 9
		
		System.out.println(homogenousArray[0]); // Hello
		System.out.println(homogenousArray[9]); // Bye
		// homogenousArray.length - 1 = 9 as the array was set to size 10
		
		// Primitive arrays
		// - arrays declared with primitives will default to a certain value
		// - booleans default to false
		// - numbers default to 0 or 0.0
		// - chars default to the null character '\u0000'
		char[] charArr = new char[10];
		System.out.println(charArr[0]); // prints an empty whitespace (the null char)
		
		int[] intArr = new int[10];
		System.out.println(intArr[0]); // 0
		
		
		// INITIALISING AN ARRAY
		// - arrays can be initialised using curly brackets
		// - arrays initialised inline cannot have their size declared, i.e. new int[10] is not allowed as the
		//   size is inferred from the input sequence
		int[] myNewIntArr = {1,2,3,4,5,6,7,8,9};
		System.out.println(myNewIntArr.length); // 9
		
		// The above can also be rewritten as:
		int[] myNewIntArr2 = new int[] {1,2,3,4,5,6,7,8,9};
	}

}
