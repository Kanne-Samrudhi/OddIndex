package com;

import java.util.Scanner;

public class OddIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		characterAtOddIndex(str);
		System.out.println("The characters at odd index are: "+characterAtOddIndex(str));

	}
	public static String characterAtOddIndex(String str) {
		String st="";
		int i=0;
		while(i<str.length()) {
			st=st+str.charAt(i);
			i=i+2;
		}
		return st;
	}
}
