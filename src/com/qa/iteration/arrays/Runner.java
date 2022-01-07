package com.qa.iteration.arrays;

public class Runner {

	public static void main(String[] args) {
		// As an array has an index, it can be iterated over using a loop
		// - the preferable option is a for loop as we can track where we are in the loop
		// - the counter variable acts as the index
		
		System.out.println("1D Array");
		int[] myArr = { 1,2,3,4,5 };
		
		// the first position in an array is 0, so we set the index variable 'i' to 0 initially
		// the last position is 'myArr.length - 1', so we iterate while 'i' is less than 'myArr.length'
		// each iteration increments 'i' by one, as if we was progressing one at a time through the array
		for (int i = 0; i < myArr.length; i++) {
			// use 'i' to access the array elements
			System.out.println(myArr[i] * 2); // getting the num out of the array, and then multiplying by 2 and printing
		}
		
		System.out.println("2D Array");
		// Iterating over multi-dimensional arrays requires a nested loop
		int[][] multiDimensionArr = { 
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		// The following iterates through every element in the 2d array
		// iterate over the rows first by getting the length of the outer array
		for (int row = 0; row < multiDimensionArr.length; row++) {
			// iterate over the columns by getting the length of the current row
			for (int col = 0; col < multiDimensionArr[row].length; col++) {
				System.out.println(multiDimensionArr[row][col]);
			}
		}
		
		// If we don't need to manipulate the data in an array, it is often not necessary to track the indexes
		// - Java provides the enhanced-for loop for this purpose, reading data from a sequence
		// Structure: for (DataType element : someArray) {}
		System.out.println("ENHANCED FOR LOOP OVER 1D ARRAY");
		for (int element : myArr) {
			// gets each int in myArr
			System.out.println(element); // prints 1 first, then 2, then 3, then 4, etc...
		}
		
		System.out.println("ENHANCED FOR LOOP OVER 2D ARRAY");
		// First, get the row in the outer for loop
		// - I've added labels to the loops to help distinguish which is outer and which is inner
		Outer: for (int[] arr : multiDimensionArr) {
			// then iterate over each element in the retrieved arr
			Inner: for (int element : arr) {
				System.out.println(element);
			}
		}
	}

}
