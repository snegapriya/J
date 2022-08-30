package com.programs;

public class Palindrome {

	public static void main(String[] args) {
		
		int n = 2534;
		
		int temp = n;
		
		int i=0,j=0;
		
	//	while(temp>0) {
		
	for (int j2 = 1; j2 <=5; j2++) {
			

			i = temp%10;
			j = (j*10)+i;
			temp = temp/10;
	//	}
			
		}
		
		System.out.println(j);
		
		
		
		
	}
}
