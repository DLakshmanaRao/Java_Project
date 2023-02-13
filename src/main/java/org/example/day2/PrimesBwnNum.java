package org.example.day2;

import java.util.Scanner;

public class PrimesBwnNum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter lower limit: ");
		int n = sc.nextInt();

		System.out.printf("Enter upper limit: ");
		int m = sc.nextInt();

		System.out.println("Prime numbers between " + n + " and " + m + " are: ");
		int count = 0;

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
				System.out.print(i + ", ");
		}
		sc.close();
    }
}
