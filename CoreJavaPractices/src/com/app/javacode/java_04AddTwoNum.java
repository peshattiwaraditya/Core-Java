package com.app.javacode;

import java.util.Scanner;

public class java_04AddTwoNum {

	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any two number :");
		int a=input.nextInt();
		int b=input.nextInt();
		int sum=a+b;
		System.out.println("Sum of two digits are :"+sum);
	}
}
