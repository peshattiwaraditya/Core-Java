package com.app.javacode;

import java.util.Scanner;

public class Java_05SwapTwoNumbers {

	public static void main(String args[]) {
		int temp;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any two numbers : ");
		int a=input.nextInt();
		int b=input.nextInt();	
		System.out.println("Two numbers are :"+a+"  "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("Two numbers after swapping are :"+a+"  "+b);
	}
}
