package com.greatlearning.corejava;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("I am default constructor. \n");
	}
	
	public ConstructorDemo(int a, float f, String s, char c) {
		System.out.println("I am Parameterized constructor.");
		System.out.println("The square of an Integer numberis: " + a * a);
		System.out.println("The square of a float numberis: " + f * f);
		System.out.println("The string you inputted is: " + s);
		System.out.println("The inputted character is: "+ c);
	}
	
	public void observations() {
		System.out.println("inside Observations method");
	}

	public static void main(String[] args) {
		ConstructorDemo obj1 = new ConstructorDemo();
		ConstructorDemo obj2 = new ConstructorDemo(21,48.7f,"Saisantoshkumar", 'z');
	}

}
