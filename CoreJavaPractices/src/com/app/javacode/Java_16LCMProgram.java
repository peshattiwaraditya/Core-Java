package com.app.javacode;

import java.util.Scanner;

public class Java_16LCMProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers : ");
		//int a=sc.nextInt();
		int b=18;
		int a=48;
		try {
			int gcd = findGCD(a, b);
			System.out.println("gcd ("+a+","+b+") :"+gcd);
			int lcm=(a*b)/gcd;
			System.out.println(" LCM op given two numbers is :"+lcm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static int findGCD(int a, int b) {
		// TODO Auto-generated method stub
		while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
		return Math.abs(a);
	}

}
