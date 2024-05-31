package com.app.javacode;

import java.util.Scanner;

public class Java_03UserInput {

	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name=input.nextLine();
		System.out.println("My name is : "+ name);	
		System.out.println("Enter your age : ");
		int age=input.nextInt();
		System.out.println("age is :"+age);
	}
}
