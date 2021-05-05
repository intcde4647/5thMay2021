package com.cts.demo.iterations;

public class WhileDemo {

	public static void main(String[] args) {
		
		int i=0; // Initialisation based on which
		// on which it is decided to be within the 
		//loop or not
		// The below while is incorrect
		//while(i=10)
		while(i<10)
		{
			System.out.println(i);
			i++; // reinitialisation step
		}
	}

}
