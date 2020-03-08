package com.startjava.lesson_2.game;

import java.util.Scanner;

public class Player {
	
	private String name;
	private int number;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int guess() {
		System.out.println(this.name + ", enter your number.");
		Scanner scanner = new Scanner(System.in);
		this.number = scanner.nextInt();
		System.out.println(this.name + ", enter " + this.number);
		return this.number;
	}
}