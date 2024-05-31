package com.app.javacode;

import java.util.Scanner;

public class Java_15FactorialNum {

	
	public  int findFactorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n* findFactorial(n-1);
	}
	public static void main(String[] args) {
		Java_15FactorialNum a=new Java_15FactorialNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num : ");
		int input=sc.nextInt();
		System.out.println("Factorial of "+input+" is :"+ a.findFactorial(input));
		
	}

}
