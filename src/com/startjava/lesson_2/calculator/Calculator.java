package com.startjava.lesson_2.calculator;

public class Calculator {
	private int a = 3;
	private int b = 8;
	private int result = 1;
		
	private char signOperator = '%';

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setb(int b) {
		this.b = b;
	}

	public char getSignOperator() {
		return signOperator;
	}

	public void setSignOperator(char signOperator) {
		this.signOperator = signOperator;
	}
}