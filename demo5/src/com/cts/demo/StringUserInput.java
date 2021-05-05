package com.cts.demo;

import java.util.Scanner;

public class StringUserInput {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 String name;
		 System.out.println("Enter a name");
		 // It will accept a single word
		 //name=scanner.next();
       // To accept multiple words
		 name=scanner.nextLine();
		 
		 System.out.println(name);
	}

}
