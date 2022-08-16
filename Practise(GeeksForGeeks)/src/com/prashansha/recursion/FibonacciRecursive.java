package com.prashansha.recursion;

public class FibonacciRecursive {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		int n=8;
		System.out.println(a);
		System.out.println(b);
		int i=1;	
		int s=printFibonacci(a,b,n,i);
		

	}

	private static int printFibonacci(int a, int b,int n,int i) {
		
		System.out.println(a+b);
		if(i==n)
			return 0;
		return printFibonacci(b,(a+b),n,(i+1));

	}

}
