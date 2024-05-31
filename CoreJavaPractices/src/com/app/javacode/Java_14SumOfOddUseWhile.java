package com.app.javacode;

public class Java_14SumOfOddUseWhile {

	public static void main(String[] args) {
		
		int a=1;
		int b=0;
		int c=0;
		while(a<=10) {
			if(a%2==0) {
				 b=b+a;
				//System.out.println("sum of even nums is :"+ b);
				a++;
			}
			else{
				 c= c+a;
			// System.out.println("sum of odd nums is :"+ c);
				 a++;
			}
		}
		System.out.println("\n\n\nsum of even nums is :"+ b);
		 System.out.println("sum of odd nums is :"+ c);
	}

}
