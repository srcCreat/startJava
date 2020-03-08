package com.startjava.lesson_2.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger("Gipsy Avenger", 81.77f, 6);
		Jaeger jaegerTwo = new Jaeger("Obsidian Fury", 78.55f, 9);

		jaegerOne.drift();
		System.out.println(jaegerOne.getModelName() + " " + jaegerOne.scanKaiju());
		jaegerOne.useVortexCannon();

		jaegerTwo.drift();
		System.out.println(jaegerTwo.getModelName() + " " + jaegerTwo.scanKaiju());
		jaegerTwo.useVortexCannon();

		System.out.println(jaegerOne.getModelName() + " have " + jaegerOne.getArmor() + " armor!");
		jaegerOne.setArmor(5);
		System.out.println(jaegerOne.getModelName() + " have " + jaegerOne.getArmor() + " armor!");
	}
}