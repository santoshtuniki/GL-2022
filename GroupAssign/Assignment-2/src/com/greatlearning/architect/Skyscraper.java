package com.greatlearning.architect;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Skyscraper {

	public static void main(String[] args) {
		// using PriorityQueue to get large floorSize to be arranged first for layout
		PriorityQueue<Integer> queueOne = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> queueTwo = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building: ");
		int n = sc.nextInt();
		
		int[] floorSize = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the floor size given on day : "+(i+1));
			floorSize[i] = sc.nextInt();
			while(floorSize[i]<=0) {
				System.out.println("Error! Please enter values greater than 0: ");
				floorSize[i] = sc.nextInt();
			}
			queueOne.add(floorSize[i]);
		}		
		sc.close();
		
		System.out.println("The order of construction is as follows: \n");		
		
		for(int i=0; i<n; i++) {
			System.out.println("Day "+(i+1)+" : ");
			
			if(queueOne.peek()==floorSize[i]) {
				System.out.print(queueOne.poll()+" ");
				
				while(!queueTwo.isEmpty() && queueTwo.peek()==queueOne.peek()) {
					System.out.print(queueOne.poll()+" ");
					queueTwo.remove();
				}
			}else {
				queueTwo.add(floorSize[i]);
			}

			System.out.println();
		}
	}

}
