package org.example.day3;

import java.util.Scanner;

public class CountPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter lower limit: ");
		int n = sc.nextInt();

		System.out.printf("Enter upper limit: ");
		int m = sc.nextInt();

		
		int count = 0;
		int dig = 0;

		for (int i = n; i <= m; i++) {
			if (i == 1 || i == 0)
				continue;
			count = 1;

			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count = 0;
					break;
				}
			}
			if (count == 1)
				dig += 1;
		}
		System.out.println("Number of prime numbers in given range = "+ dig);
		sc.close();
	}

}
