package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialServiceImpl implements CredentialService {
	
	public String companyName = "greatlearning";
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		return (firstName+lastName+"@"+department+"."+companyName+".com");
	};

	public char[] generatePassword() {
		
		String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String number = "1234567890";
		String special = "!@#$/<>()*&%"; 
		
		String value = capital+small+number+special;
		
		// using random method 
		Random random = new Random();
		char[] password = new char[8];
		
		for(int i=0;i<8;i++) {
			//use of charAt() method is to get the character value
			//use of nextInt() method as it is scanning the value as int
			password[i] = value.charAt(random.nextInt(value.length()));
		}
		
		return password;	
	};
	
	public void showCredentials(Employee employee, String email) {
		
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows: ");
		System.out.println("Email --> "+ email);
		String generatePassword = new String(generatePassword());
		System.out.println("Password --> "+ generatePassword);
		
	};
}
