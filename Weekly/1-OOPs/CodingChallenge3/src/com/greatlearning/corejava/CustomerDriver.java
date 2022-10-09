package com.greatlearning.corejava;

public class CustomerDriver {

	public static void main(String[] args) {
		Customer customer = new Customer();
		System.out.println(customer.firstName);
		System.out.println(customer.lastName);
		System.out.println(customer.age);
		System.out.println(customer.city);
		//System.out.println(customer.password); --> It will give compilation error.
	}
}
