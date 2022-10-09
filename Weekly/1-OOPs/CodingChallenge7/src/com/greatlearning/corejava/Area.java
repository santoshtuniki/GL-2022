package com.greatlearning.corejava;

import java.util.Scanner;

public class Area {
	final float pi = 22/7;
	public float radius, result;
	
	Area(float r) {
		radius = r;
	}
	
	public void display() {
		result = pi * radius * radius;
		System.out.println("The area of the circle is: \n"+ result + " sq.cm");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		float r = sc.nextFloat();
		Area area = new Area(r);
		area.display();
		sc.close();
	}
}
