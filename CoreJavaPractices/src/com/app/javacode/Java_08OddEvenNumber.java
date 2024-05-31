package com.app.javacode;

public class Java_08OddEvenNumber {

	public static void main(String args[]) {
		
		int a=7;
		if(a%2==0) {
			 System.out.println(" Even number is : "+a);
		}
		else {
			 System.out.println(" Odd number is : "+a);
		}
		
		int b=7;
		int c=1;
		
		if(a>b) {
			if(a>c) {
			System.out.println("Greatest number is "+ a);
		}
			else {
				System.out.println("Greatest number is "+ c);
			}
	}
		else if(b>c) {
			if(b>a) {
				System.out.println("Greatest number is "+ b);
			}
			else {
				System.out.println("Greatest number is "+ a);
			}
		}
		else if(c>a) {
			if(c>b) {
				System.out.println("Greatest number is "+ c);
			}
			else {
				System.out.println("Greatest number is "+ b);
			}
		}
		else{
			System.out.println("All numbers are same "+a+" "+b+" "+c);	
		}
	}
	
}
