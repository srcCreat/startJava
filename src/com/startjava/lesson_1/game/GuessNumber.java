package com.startjava.lesson_1.game;

public class GuessNumber {
	public static void main(String[] args) {
		int hiddenNumber = 45;
		int enterNumber = 23;

		while (true) {
			System.out.println("Guess the number!");

			if (enterNumber == hiddenNumber) {		
				System.out.println("You win!");
				break;
			} else if (enterNumber > hiddenNumber) {
				System.out.println("The number you entered is greater than what the computer made");
				enterNumber--;
			} else if (enterNumber < hiddenNumber) {
				System.out.println("The number you entered is less than what the computer made");
				enterNumber++;
			}
		}	
	}
}
