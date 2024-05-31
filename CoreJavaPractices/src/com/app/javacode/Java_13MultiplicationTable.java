package com.app.javacode;

import java.util.Scanner;

public class Java_13MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int a=sc.nextInt();
		int b=1;
		while(b<=10) {
			int mul=a*b;
			b++;
			System.out.println("Mul :"+mul);
		}
	}

}
