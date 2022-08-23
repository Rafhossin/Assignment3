package com.Assignment3;

import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		// Program to reverse a sentence while preserving the position
		
		String st = "Think Twice";
		String st1 = " ";
		String[] stArray = st.split("");
		
		for (int i =0;i<stArray.length-1;i++) {
			if(i==0) {
				for(int i1 = (stArray.length-1)/2;i1>=0;i1--) {
					//System.out.print(stArray[i1]);
					st1 = st1+stArray[i1];
				}
				//System.out.print(" ");
				st1 = st1+" ";
			}
			else if(i ==1) {
				
					for(int i1 = (stArray.length-1);i1>=5;i1--) {
						//System.out.print(stArray[i1]);
						st1 = st1+stArray[i1];
		}


			}
		}System.out.println(st1);
	}
	
}