package com.prashansha.codingPractise;

public class ReverseNo {

	public static void main(String[] args) {
		System.out.println(reverse(-321));

	}
	
	 @SuppressWarnings("finally")
	public static int reverse(int x) {
	        int rev=0;
	        int isNegative=0;
	        boolean isException=false;
			while (x != 0) {
				try {
					int digit = x % 10;
					rev = Math.multiplyExact(rev, 10) + digit;
					if (rev >= (Math.pow(2, 31) - 1) || rev <= -(Math.pow(2, 31))) {
						return 0;
					}
					x = x / 10;
				} catch (Exception e) {
					isException = true;
				} finally {
					if (isException == true)
						return 0;
					else
						return rev;
				}
			}
	        
	        
	    }

}
