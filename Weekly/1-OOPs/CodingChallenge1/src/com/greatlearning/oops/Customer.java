package com.greatlearning.oops;

public class Customer {

	int age;
	String fullName;

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.age = 21;
		customer.fullName = "Saisantoshkumar Tuniki";
		System.out.println(customer.fullName);
		System.out.println(customer.age);
	}
}
