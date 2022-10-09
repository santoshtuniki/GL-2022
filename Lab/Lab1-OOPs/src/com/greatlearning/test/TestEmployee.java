package com.greatlearning.test;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;
import com.greatlearning.service.CredentialServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String fname = sc.nextLine();
		System.out.println("Enter your last name: ");
		String lname = sc.nextLine();
		
		int option;
		String deptName = "gen";
		boolean flag = true;
		
		do {
			System.out.println("Please enter the department from the following: ");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			option = sc.nextInt();
			
			switch(option) {
			case 1:
				deptName="tech";
				flag = false;
				break;
			case 2:
				deptName="adm";
				flag = false;
				break;
			case 3:
				deptName="hr";
				flag = false;
				break;
			case 4:
				deptName="lg";
				flag = false;
				break;
			default:
				System.out.println("Enter a valid option");
				break;
			}
		}while(flag==true);

		Employee employee = new Employee(fname, lname);

		CredentialService credentials = new CredentialServiceImpl();
		String email = credentials.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), deptName);
		credentials.showCredentials(employee, email);

		sc.close();
	}

}
