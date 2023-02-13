package org.example.day2;

import java.util.Scanner;

public class SumevenandOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int even = 0;
		int odd = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		System.out.println("Sum of even numbers = " + even);
		System.out.println("Sum of odd numbers = " + odd);
		sc.close();
	}

}

