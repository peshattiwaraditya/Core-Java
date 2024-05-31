package com.app.javacode;

import java.util.Scanner;

public class Java_12EvenOddThrBitwiceOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check it is even or not : ");
		int a=sc.nextInt();
		
		if((a & 1)==0) {
			System.out.println("Even number is : "+ a);	
		}
		else {
			System.out.println("odd number is : "+ a);
		}
	}

}
