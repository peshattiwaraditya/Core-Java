package com.app.javacode;

import java.util.Scanner;

public class Java_21Patterns {

	public static void main(String agrs[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any numbers to print patterns");
	int a=sc.nextInt();

	for(int i=a;i<1;i++) {
		for(int j=0;j<a;j++) {
			if(i<=j) {
			System.out.print("*");
			}
			
						
		}
		System.out.println("\n");
	}
	
}
}
