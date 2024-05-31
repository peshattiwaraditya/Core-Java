package com.app.javacode;

import java.util.Scanner;

public class Java_07CheckNumbTypePNZ {

	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the num : ");
		int a=input.nextInt();
		if(a<0) {
			System.out.println("Number is Negative :"+a);
		}
		else if(a>0) {
			System.out.println("Number is positive :"+a);
		}
		else {
			System.out.println("Number is Zero :"+a);
		}
		
	}
}
