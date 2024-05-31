package com.app.javacode;

import java.util.Scanner;

public class Java_06AllArithmaticOperators {

	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any two numbers :");
		int a=input.nextInt();
		int b=input.nextInt();
		
		System.out.println("user enterd two numbers are :"+a+" "+b);
		System.out.println("Sum of two numers :"+(a+b));
		System.out.println("Substraction of two numbers :"+(a-b));
		System.out.println("Multiplication of two numbers :"+(a*b));
		System.out.println("Devision of two numbers :"+(a/b));
		System.out.println("Module of two numbers :"+(a%b));
		
		//Product of two floating numbers
		float c=34.5f;
		float d=567.2f;
		float mul=c*d;
		System.out.println("Product of two floating point : "+mul);
		
		//Perimeter of rectangle
		double per=a+b+c+d;
		System.out.println("Perimeter of rectangle :"+per);
		
		//Area of triangle
		double tri=a*b*1/2;
		System.out.println("Area of triangle : "+tri);
		
		//Simple Interest
		System.out.println("Enter the values of P,T,R :");
		int P=input.nextInt();
		int T=input.nextInt();
		int R=input.nextInt();
		double si=(P*T*R)/100;
		System.out.println("Simple Interest :"+ si);
		
		//Compound Interest'
		double ci=P*(1+R/100);
		System.out.println("Compound Interest :"+ci);
		
		//celcious to ferenhite
		System.out.println("Enter Fehrenite F :");
		int F=input.nextInt();
		double C=(F-32)*5/9;
		System.out.println("Conversion of ferenhite to celcious is : "+C);
	}
}
