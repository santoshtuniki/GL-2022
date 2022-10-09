package com.greatlearning.corejava;

public class HealthDriver {

	public static void main(String[] args) {
		Health health = new Health();
		System.out.println("Age is: "+ health.age + " years");
		System.out.println("Weight is: "+ health.weight + " kg");
		System.out.println("BMI is: "+ health.bmi);
	}
}
