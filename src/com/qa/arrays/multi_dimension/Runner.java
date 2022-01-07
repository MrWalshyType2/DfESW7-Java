package com.qa.arrays.multi_dimension;

public class Runner {

	public static void main(String[] args) {
		// Arrays can have multiple dimensions, this allows for arrays to contain arrays
		// - this makes creating tabular style data quite simple
		
		// To add a dimension to an array, specify an extra set of square brackets
		
		// 2D-Array
		// This example creates an array that can contain 3 arrays, each of which contains 5 elements
		int[][] intArr = new int[3][5];
		intArr[0] = new int[] { 1,2,3,4,5 };
		intArr[1] = new int[] { 6,7,8,9,10 };
		intArr[2] = new int[] { 11,12,13,14,15 };
		
		// The same array can also be declared and initialised in one go:
		int[][] intArrCopy = new int[][] {
			{ 1,2,3,4,5 }, // row 0
			{ 6,7,8,9,10 }, // row 1
			{ 11,12,13,14,15} // row 2
		};

		// The data above can be thought of as rows and columns
		// Column >|  0  |  1  |  2  |  3  |  4  |
		// Row     |-----------------------------|
		// 0       |  1  |  2  |  3  |  4  |  5  |
		// 1       |  6  |  7  |  8  |  9  |  10 |
		// 2       |  11 |  12 |  13 |  14 |  15 |
		
		// This means, to get the value 7 out of the array we need to access row 1, column 1
		int row = 1;
		int col = 1;
		System.out.println(intArr[row][col]);
	}

}
