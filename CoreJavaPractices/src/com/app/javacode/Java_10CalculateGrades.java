package com.app.javacode;

import java.util.Scanner;

public class Java_10CalculateGrades {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks : ");
		Double marks=sc.nextDouble();
		
		if(marks>90) {
			System.out.println("Got A Grdaes");
		}
		else if(marks>75) {
			System.out.println("Got B Grdaes");
		}
		else if(marks>60) {
			System.out.println("Got C Grdaes");
		}
		else if(marks>30) {
			System.out.println("Got D Grdaes");
		}
		else if(marks<30) {
			System.out.println("Got F Grdaes");
			
		}
  }
}
