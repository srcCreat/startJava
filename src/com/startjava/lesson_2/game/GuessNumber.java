package com.startjava.lesson_2.game;

import java.util.Scanner;

public class GuessNumber {
	
	public void startGame() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Player 1, enter your name.");
		Player player1 = new Player(scanner.nextLine());
		System.out.println("Player 2, enter your name.");
		Player player2 = new Player(scanner.nextLine());

		int guess1;
		int guess2;

		boolean player1IsRight = false;
		boolean player2IsRight = false;
		boolean retry = true;

		int hiddenNumber = (int) (Math.random() * 100);
		System.out.println("Computer made up number " + hiddenNumber);
		System.out.println("Players, lets try to guess this number!");

		while(retry) {
			
			guess1 = player1.guess();
			guess2 = player2.guess();
		
			if(guess1 == hiddenNumber) {
				player1IsRight = true;
			} 
			if(guess2 == hiddenNumber) {
				player2IsRight = true;
			} 
			
			if(player1IsRight & player2IsRight) {
				System.out.println("DRAW! Both players win!");
				break;
			} else if(player1IsRight) {
				System.out.println("We have a winner - " + player1.getName() + "! " + player2.getName() + ", lucky next time!;)");
				break;
			} else if(player2IsRight) {
				System.out.println("We have a winner - " + player2.getName() + "! " + player1.getName() + ", lucky next time!;)");
				break;
			} else {
				System.out.println("Nobody guess :(");
				System.out.println("Do you wanna try again? [yes/no]");
				String retryAnswer = scanner.nextLine();
				while(true) {
					if(retryAnswer.equals("yes")) {
						retry = true;
						break;
					} else if(retryAnswer.equals("no")) {
						retry = false;
						break;
					} else {
						System.out.println("Do you wanna try again? [yes/no]");
						retryAnswer = scanner.nextLine();	
					}	
				}	
			}	
		}		
	}
}