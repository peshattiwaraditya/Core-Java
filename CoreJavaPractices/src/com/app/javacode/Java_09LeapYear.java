package com.app.javacode;

import java.util.Scanner;

public class Java_09LeapYear {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year in yyyy format : ");
		int yr=sc.nextInt();
		if(yr%4==0) {
			System.out.println(yr+" Is Leap year");
		}
		else {
			System.out.println(yr+" Is not Leap year");
		}
	}
}
