package com.Assignment3;

import java.util.Scanner;

import com.Practice.Array;

public class Question3 {
	// Program to check two strings contain the same character set(anagram of each other)
	//but the order is different
	
	
	static int noOfCharecters = 256;
	
	//Function to check if two strings are anagram to each other
	
	static boolean checkStringsAnagram(char[] chSet1, char[] chSet2 ) {
		//create count array and initialise all values as 0
		int[] count = new int[noOfCharecters];
		int i = 0;
		
		//To check if the both string has different size
		if(chSet1.length != chSet2.length) 
			return false;
		
		//For each character of the input strings update the count array
		
		for(i = 0;i<chSet1.length;i++) {
			
			count[chSet1[i]]++;
			count[chSet2[i]]--;
			
		}
		
		// to check if there is any non-zero value in count array
		
		for(i =0;i<count.length;i++) 
			if(count[i] !=0) {
				return false;
			}
			return true;
		}
			
			
		
		
		
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Pls enter the first strings: ");
		char chSet1[] = scanner.nextLine().toCharArray();
	
		System.out.print("Pls enter the second strings: ");
		char chSet2[] = scanner.nextLine().toCharArray();
		
		if (checkStringsAnagram(chSet1, chSet2)) {
			
			System.out.println("The two strings are anagram two each other.");
			
		}else {
			System.out.println("The two strings are not anagram two each other.");
		}
	}

}
