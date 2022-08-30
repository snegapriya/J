package com.programs;

public class Replace_Program {

	public static void main(String[] args) {

		String s = "Welcome to java";

		String rep = s.replaceAll("[AEIOUaeiou]", "@");

		System.out.println(rep);

		
		//Factorial
		int count = 1;
		for (int i = 1; i <= 5; i++) {

			count = count * i;

		}

		System.out.println(count);

	}
}
