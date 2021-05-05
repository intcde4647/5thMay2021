package com.cts.demo;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// The object of Scanner class helps in accepting user input 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=scan.nextInt();
		System.out.println("The entered number is "+num1);

	}

}
