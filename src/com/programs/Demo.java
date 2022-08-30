package com.programs;

public class Demo {

	
	static int a;
	
	public static int sample() {

		a = 25;
		
        return a;
        
    //    a = 56; we can't change the value of the variable a
	}
	
	public static void main(String[] args) {
		
		sample();
	}
	
}
