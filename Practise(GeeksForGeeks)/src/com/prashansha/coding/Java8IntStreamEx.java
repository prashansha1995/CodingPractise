package com.prashansha.coding;

/**
 * This class uses Java8 IntStream Functionality.
 * It converts traditional for loop to InStream using Java8.
 * it first take no . of test cases input..followed by  numbers.
 * 
 *Given a number N, print all numbers in range from 1 to N having exactly 3 divisors.
Examples:

Input : N = 16
Output : 4 9
4 and 9 have exactly three divisors.
Divisor

Input : N = 49
Output : 4 9 25 49
4, 9, 25 and 49 have exactly three divisors.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class Java8IntStreamEx {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());

		IntStream.rangeClosed(1, testCases).forEach(nbr -> {
			int n = 0;
			try {
				n = Integer.parseInt(br.readLine());
				int count = getDivisor(n);
				System.out.println(count);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	private static int getDivisor(int nbr) {

		List<Integer> list = new ArrayList<>();

		IntStream.rangeClosed(1, nbr).forEach(value -> {
			int[] counter = { 0 };
			IntStream.rangeClosed(1, value).forEach(valuej -> {
				if (value % valuej == 0) {
					counter[0]++;
				}
			});
			if (counter[0] == 3) {
				list.add(value);
			}

		});

		return list.size();
	}
}