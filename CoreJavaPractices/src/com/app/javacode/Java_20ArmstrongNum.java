package com.app.javacode;

import java.util.Scanner;

public class Java_20ArmstrongNum {
	static int sum1;
	static int ad=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to check num is armstrong num or not : ");
		int a=sc.nextInt();
		char[] b= Integer.toString(a).toCharArray();
		for(int i=0;i<b.length;i++){
			int d=Character.getNumericValue(b[i]);
			
			   sum1 = findSum(findCube(d));
			 // System.out.println()
		}	
		System.out.println(sum1);
		if(a==sum1) {
			System.out.println("Given num is Armstrong num : "+a);
		}
		else
			System.out.println("Given num is not a Armstrong num : "+a);
	}

	private static int findSum(int sum) {
		 try {
			ad=ad+sum;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ad;
	}

	public static int findCube(int num) {
		int mul=num*num*num;
		return mul;
	}
}
