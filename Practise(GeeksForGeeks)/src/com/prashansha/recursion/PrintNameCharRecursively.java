package com.prashansha.recursion;

public class PrintNameCharRecursively {

	public static void main(String[] args) {
		String str="PRASHANSHA";
		printNameChar(str);
	}

	private static void printNameChar(String str) {
		int i=0;
		if(i>str.length())
			System.exit(0);
		
		System.out.println(str.charAt(0));
		
		printNameChar(str.substring(i+1));
	}
	
}
