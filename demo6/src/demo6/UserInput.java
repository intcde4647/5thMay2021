package demo6;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// scan is an object or a reference variable of Scanner class
		Scanner scan=new Scanner(System.in);
		// num1 and num2 are variable of int type
		int num1=0;
		int num2=0;
		System.out.println("Enter the first number num1");
		num1=scan.nextInt();
		System.out.println("Entrer the second number num2");
		num2=scan.nextInt();
		if(num1>0 && num2>0)
		{
		
		int result=num1+num2;
		System.out.println("num1+num2="+result);
		System.out.println(num1+"+"+num2+"="+result);
		}
		else
		{
			System.out.println("Both the number should be positive");
		}
	}

}
