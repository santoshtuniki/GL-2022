package com.greatlearning.architect;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Skyscraper {

	public static void main(String[] args) {
		// using PriorityQueue to get large floorSize to be arranged first for layout
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
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
			queue.add(floorSize[i]);
		}		
		sc.close();
		
		System.out.println("The order of construction is as follows: \n");		
		int count = 0;
		
		for(int i=0;i<n;i++) {
			System.out.println("Day : "+(i+1));
			// on last day, remaining floors arranged based on the leftover data.
			if(i==n-1) {
				while(!queue.isEmpty())
					System.out.print(queue.poll()+" ");
				break;
			} 
		
			if(floorSize[i]==queue.peek()) {
				// if any day is skipped, we check whether we can make out in subsequent days
				if(count>0) {
					int j=0;
					int k=-1;
					while(j<=count && !(queue.isEmpty())) 
					{
						if(floorSize[i-j]==queue.peek()) {
							System.out.print(queue.poll()+" ");
							k++;
						}
						j++;
					}
					count = count-k;
					System.out.println();	
				} 
				// check if we can construct directly on same day
				else if(floorSize[i]==queue.peek()) {
					System.out.println(queue.poll());
				} 
				
			} else {
				System.out.println("");
				count++;
			}
		}	
		
	}

}
