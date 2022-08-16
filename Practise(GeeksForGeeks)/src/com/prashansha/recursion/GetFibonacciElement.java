package com.prashansha.recursion;

public class GetFibonacciElement {

	public static void main(String[] args) {
		int n=5;
		System.out.println(getFibonacciEle(n));

	}

	private static int getFibonacciEle(int n) {
	if(n<=0)
		return -1;
	if(n==1 || n==2)
		return 1;
	
		return getFibonacciEle(n-1)+ getFibonacciEle(n-2);
		
	}

}
