package com.Assignment3;

import java.util.Scanner;

public class Question4 {
	//program to check if a string or sentence is Pangram(contain all the alphabets)
	static int noOfCharecter = 26;
	
	//Function to check whether a string is pangram
	static boolean isPangram(String string) {
		// creating a boolean array of size 26 and by default the values are set to 
		//false
		boolean[] container = new boolean[noOfCharecter] ;
		int index = 0;
		
		for(int i = 0;i<string.length();i++) {
			
			//if it is an Uppercase letter subtract 'A' to find the index
			if('A'<= string.charAt(i) && string.charAt(i) <= 'Z' ) {
				index = string.charAt(i) - 'A';
				}
			//	//if it is an lowercase letter subtract 'a' to find the index
			else if('a'<= string.charAt(i) && string.charAt(i) <= 'z' ) {
				index = string.charAt(i) - 'a';
		}
			else 
			//if it is other than a letter
			continue;
			container[index] = true;
		
		}
		
		//Return false if any of the index value is unmarked
		for(int i = 0;i<container.length;i++) 
			if(container[i]== false) 
				return (false);
			
			
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("pls enter a pangram string: ");
		String string = scanner.nextLine();
		
		if(isPangram(string)) {
			System.out.println(string + " is a pangram string.");
			
		}else {
			System.out.println(string + " is not a pangram string.");
		}

	}

}
