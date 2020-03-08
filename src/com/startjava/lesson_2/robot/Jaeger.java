package com.startjava.lesson_2.robot;

public class Jaeger {
	
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;

	public Jaeger(String modelName, float height, int speed) {
		this.modelName = modelName;
		this.height = height;
		this.speed = speed;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		if(modelName == "") {
			System.out.println("Uncorrect model name");
		} else {
			this.modelName = modelName;
		}
	}
	
	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		if(mark == "") {
			System.out.println("Uncorrect mark");
		} else {
			this.mark = mark;
		}
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		if(origin == "") {
			System.out.println("Enter correct origin");
		} else {
			this.origin = origin;
		}
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		if(height < 0) {
			System.out.println("Height cannot be negative");
		} else {
			this.height = height;
		}
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float height) {
		if(weight < 0) {
			System.out.println("Weight cannot be negative");
		} else {
			this.weight = weight;
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed < 0) {
			System.out.println("Speed cannot be negative");
		} else {
			this.speed = speed;
		}
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		if(strength < 0) {
			System.out.println("Strength cannot be negative");
		} else {
			this.strength = strength;
		}
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		if(armor < 0) {
			System.out.println("Armor cannot be negative");
		} else {
			this.armor = armor;
		}
	}

	public boolean drift() {
		System.out.println("You are in drift");
		return true;
	}

	public void move() {
		System.out.println(modelName + " is moving");
	}

	public String scanKaiju() {
		return "scanning Kaiju!...";
	}

	public void useVortexCannon() {
		System.out.println(modelName + " FIRE!");
	}
}