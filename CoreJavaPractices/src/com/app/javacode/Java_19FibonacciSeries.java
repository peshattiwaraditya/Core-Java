package com.app.javacode;

import java.util.Scanner;

public class Java_19FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any num :");
		int a=sc.nextInt();
		for (int i = 0; i < a; i++) {
            System.out.print(fibSer(i) + " ");
        }
	//	System.out.println("Fibonocci seres numbers is :"+fibSer(a));

	}

	private static int fibSer(int a) {
		if(a<=1) {
			return a;
		}
		else{
			return fibSer(a-1)+fibSer(a-2);
		}
		//return null;
	}

}
