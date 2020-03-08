package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		int a = 3;
		int b = 8;
		int result = 1;
		
		char signOperator = '%';

		if (signOperator == '+') {
			System.out.println(a + b);
		} else if (signOperator == '-') {
			System.out.println(b - a);
		} else if (signOperator == '*') {
			System.out.println(a * b);
		} else if (signOperator == '/') {
			System.out.println(b / a);
		} else if (signOperator == '^') {
			while (a > 0) {
				result *= b;
				a--;
			}
			System.out.println(result);
		} else if (signOperator == '%') {
			System.out.println(b % a);
		}
	}
}