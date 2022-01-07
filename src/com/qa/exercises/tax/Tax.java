package com.qa.exercises.tax;

public class Tax {

	public int calculateTaxRate(int salary) {
		if (salary < 15000) {
			return 0;
		} else if (salary < 20000) {
			return 10;
		} else if (salary < 30000) {
			return 15;
		} else if (salary < 45000) {
			return 20;
		} else {
			return 25;
		}
	}
	
	public int calculateTax(int salary) {
		int taxRate = calculateTaxRate(salary);
		
		int tax = salary / 100 * taxRate;
		return tax;
	}
}
