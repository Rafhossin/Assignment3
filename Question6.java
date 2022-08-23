package com.Assignment3;

import java.util.Scanner;

public class Question6 {
	//Method to print the string characters Alphabetically
	
	public static void viewStringAlphabetically (char[] charset){
        
        char temporaryVariable;
        System.out.println("\nString characters in alphabetical order:");
//        algorithm for sorting
        for ( int i = 0; i < charset.length; i++) {         //holds each elements
            for( int j = i+1;j<charset.length;j++ ){        //check for remaining elements
//              used the compareTo() method to compare and swap the array elements.
                if (charset[i] > charset[j]){
                    temporaryVariable = charset[i];
                    charset[i] = charset[j];
                    charset[j] = temporaryVariable;

                }
            }
            System.out.print(charset[i] + " ");
        }
        System.out.println();
        }

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("pls enter a string or a sentence: ");
		String string = scanner.nextLine();
		char []charset = string.toCharArray();
	
		
		viewStringAlphabetically(charset);

	}

}
