package com.Assignment3;

import java.util.Scanner;

public class Question7 {
	
	//A program to count the number of vowels and consonants in a given string
	
	static int count ; 
	static int countConsonants;
	
	
	public static void 	countTheNoOfVowelsAndConsonent(char [] charset) {
		
		 for ( int i = 0; i < charset.length; i++) {         //holds each elements
	            if(charset[i]=='a'|| charset[i]=='e'||charset[i]=='i'||
	            		charset[i]=='o'||charset[i]=='u') { 
	            	count++;
	            }
	            else if(charset[i]==' ') {
	            	continue;
	            }
	            else {
	            	charset[i]='c';
	            	countConsonants++;
	            	
;
	            }
	            
		 }System.out.println("Number of vowels: "+count);
		 System.out.println("Number of Consonents: "+countConsonants);
	}

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("pls enter a string or a sentence: ");
		String string = scanner.nextLine().toLowerCase();
		char []charset = string.toCharArray();
	
		
		countTheNoOfVowelsAndConsonent(charset);

	}

}
