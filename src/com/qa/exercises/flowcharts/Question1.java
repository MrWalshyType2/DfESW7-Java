package com.qa.exercises.flowcharts;

public class Question1 {

	public int sumElseProduct(int num1, int num2, boolean isAddition) {
		if (isAddition == true) {
			return num1 + num2;
		} else {
			return num1 * num2;
		}
	}
}
