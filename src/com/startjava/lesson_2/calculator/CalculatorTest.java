package com.startjava.lesson_2.calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc1 = new Calculator();

		System.out.println("Enter first number: " + calc1.getA());
		System.out.println("Enter sign operator: " + calc1.getSignOperator());
		System.out.println("Enter first number: " + calc1.getB());

		switch(calc1.getSignOperator()) {
			case '+': 	System.out.println(calc1.getA() + calc1.getB());
						break;
			case '-': 	System.out.println(calc1.getB() - calc1.getA());
						break;
			case '*':	System.out.println(calc1.getA() * calc1.getB());
						break;
			case '/':	System.out.println(calc1.getB() / calc1.getA());
						break;
			case '^':	int a = calc1.getA();
						int b = calc1.getB();
						int result = 0;
						while (a > 0) {
							result *= b;
							a--;
						}
						System.out.println(result);
						break;
			case '%':	System.out.println(calc1.getB() % calc1.getA());
						break;
		}
	}
}