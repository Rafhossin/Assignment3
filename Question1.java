package com.Assignment3;

public class Question1 {
	public static void main(String[] args) {
		//program to reverse a string
		
		String string = "iNeuron";
		String newString = "";
		
		for(int i = string.length()-1; i >=0;i-- ){
			newString = newString + string.charAt(i);
		}
		System.out.println(newString);
	}

}
