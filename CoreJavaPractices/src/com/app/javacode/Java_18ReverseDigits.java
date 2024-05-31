package com.app.javacode;


import java.util.ArrayList;
import java.util.Scanner;

public class Java_18ReverseDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any four digit num :");
		int a=sc.nextInt();
		System.out.println("Reverse digits are :"+ revDigit(a));

	}

	private static String revDigit(int a) {
	
	String b=Integer.toString(a);
	char[] a1=new char[b.length()];
	int temp=0;
	for(int i=b.length()-1;i>=0;i--) {
		a1[temp]=b.charAt(i);
		temp++;
	}
	return new String(a1);
	}

	

}




/* Reversinng the string
 * 
 * class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        char[] rev=str.toCharArray();
        char[] a=new char[rev.length];
        int temp=0;
        for(int i=rev.length-1;i>=0;i--)
        {
          a[temp]= rev[i];
          temp++;
        }
       // System.out.println(a);
        String b= new String(a);
        return b;
        // Reverse the string str
    }
}
 * 
 * */
