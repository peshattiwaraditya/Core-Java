package com.app.javacode;

import java.util.Scanner;

public class Java_17PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Any number :");
		int b=sc.nextInt();
		try {
			if (m1(b)) {
	            System.out.println(b + " is a prime number.");
	        } else {
	            System.out.println(b + " is not a prime number.");
	        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static boolean m1(int a) {
		if(a<2) {
			System.out.println("Its not a prime number");
			return false;
		}
		int num=a;
		for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not prime
            	//System.out.println("Its not a prime number");	
            }
            
        }
		return true;
	}

}
