package com.Assignment3;

import java.util.Scanner;

public class Question5 {
	//Program to print duplicate characters in a given string
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("pls write a string or sentense:");
		String string = scanner.nextLine();
		
		int count =0;
		//convert string into to char array
		char [] charset = string.toCharArray();
		
		System.out.println("Duplicate characters in a given string are:");
		//Counts each character present in the string
		
		for(int i=0;i<charset.length;i++) {
			count = 1;
			
			for(int j =i+1;j<charset.length;j++) {
				
				if(charset[i] == charset[j] ) {
					count++;
					//set charset[j] to 'O' by not printing the same character twice
					charset[j] = '/';
					break;
				
					
				
				}
				
			}if(count>1 && charset[i] != '/'  ) {
				System.out.print(charset[i]+" ");
			
				
			}
			
			
			
			
			
			
		}
	}

}
