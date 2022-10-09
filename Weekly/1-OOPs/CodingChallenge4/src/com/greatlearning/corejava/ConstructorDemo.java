package com.greatlearning.corejava;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("Hello my dear! \n Default Constructor is here.");
		System.out.println();
	}
	
	public ConstructorDemo(int x) {
		System.out.println("Hello my dear! \n One Parameter Constructor is here.");
		System.out.println("Thanks for enetring parameter: " + x);
		System.out.println();
	}
	
	public ConstructorDemo(int x, float y) {
		System.out.println("Hello my dear! \n Two Parameter Constructor is here.");
		System.out.println("Thanks for enetring parameters: " + x + ", " + y);
		System.out.println();
	}
	
	public ConstructorDemo(int x, float y, String z) {
		System.out.println("Hello my dear! \n Three Parameter Constructor is here.");
		System.out.println("Thanks for enetring parameters: " + x + ", " + y + ", " + z);
		System.out.println();
	}

	public static void main(String[] args) {
		ConstructorDemo constructor1 = new ConstructorDemo();
		ConstructorDemo constructor2 = new ConstructorDemo(9);
		ConstructorDemo constructor3 = new ConstructorDemo(9,99.9f);
		ConstructorDemo constructor4 = new ConstructorDemo(9,99.9f,"sai");
	}

}
