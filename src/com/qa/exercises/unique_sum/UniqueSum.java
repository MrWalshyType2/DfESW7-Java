package com.qa.exercises.unique_sum;

public class UniqueSum {
	
	// unique sum
	public static int uniqueSum(int n1, int n2, int n3) {
		int sum = 0;
		
		if (n1 != n2 && n1 != n3) {
			sum += n1;
		}
		if (n2 != n1 && n2 != n3) {
			sum += n2;
		}
		if (n3 != n1 && n3 != n2) {
			sum += n3;
		}
		return sum;
	}
}
