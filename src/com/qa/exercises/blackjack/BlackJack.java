package com.qa.exercises.blackjack;

public class BlackJack {

	// Blackjack
	public static int play(int n1, int n2) {
		if (n1 > 21 && n2 > 21) return 0;
		
		if (n1 <= 21 || n2 <= 21) {
			if (n1 <= 21 && (n1 >= n2 || n2 > 21)) return n1;
			else if (n2 <= 21) return n2;
		}
		return 0;
		
    }

	
}
