package com.gl.array;

public class ArrayOperationsDemo {
	int[] arr;
	int size;
	int capacity;
	
	ArrayOperationsDemo(int capacity) { // parameterized constructor
		this.capacity = capacity; // here this.capacity is referring to the variable declared outside the constructor
		arr = new int[capacity];
		size = 0;
	}
	
	void insertInEnd(int element) {
		arr[size++] = element; //insert at arr[size] and increment size by 1
	}
	
	void insertAtIndex(int element, int index) {
		if(size==capacity) // if there is only one line inside the loop or conditional statement, we write it as shown here
			return;
		
		for(int i=size-1;i>=index;i--) 
		{
			arr[i+1] = arr[i]; // shifting all the elements one step right. starting from last element
		}
		
		arr[index] = element; // inserting value at the given index
		size++; // incrementing the size by 1. here size will just get incremented
	}
	
	int deleteInEnd() {
		int deletedElement = arr[size-1];
		arr[size-1] = 0; // make the last value of index to 0 and reduce the size by 1
		size--;
		return deletedElement; // returning the deleted value. can print it or store it in other variable
	}
	
	int deleteAtIndex(int index) {
		if(index>=size)
			return -1;
		int deletedElement = arr[index];
		for(int i = index;i<size;i++)
			arr[i] = arr[i+1]; // simply replacing the value at index with its adjacent value
		size--;
		return deletedElement; // returning the deleted value. can print it or store it in other variable
	}
	
	void traversal() {
		System.out.println("\nArray: ");
		for(int i=0;i<size;i++) 
		{
			System.out.print(arr[i]+ " "); // .print will continue printing in the same line.
		}
		System.out.println("\n"); // .println will print the value and go to new line. \n will go to new line/break line
	}
	
	public static void main(String[] args) {
		ArrayOperationsDemo ob = new ArrayOperationsDemo(10);
		ob.insertInEnd(20);
		ob.insertInEnd(1);
		ob.insertInEnd(3);
		ob.insertInEnd(14);
		ob.insertInEnd(32);
		ob.insertInEnd(67);
		ob.insertAtIndex(15, 1);
		ob.traversal();
		System.out.println("deleted value is: "+ob.deleteAtIndex(2));
		ob.traversal();
	}
}

 
