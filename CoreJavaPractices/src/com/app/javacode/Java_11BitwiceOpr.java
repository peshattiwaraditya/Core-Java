package com.app.javacode;

import java.util.Scanner;

public class Java_11BitwiceOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("BITWICE AND Operator : "+(a&b));
		System.out.println("BITWICE OR Operator : "+(a|b));
		System.out.println("BITWICE XOR Operator : "+(a^b));
		System.out.println("BITWICE NOT Operator : "+(~a));
		System.out.println("BITWICE Right shift Operator : "+(a>>b));
		System.out.println("BITWICE Left shift Operator : "+(a<<b));
	}

}
