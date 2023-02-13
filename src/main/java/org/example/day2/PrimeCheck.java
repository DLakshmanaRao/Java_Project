package org.example.day2;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int count = 0;
		if (n == 0 || n == 1) {
			System.out.println("Given number " + n + " is Not Prime");
		} else {
			for (int i = 2; i <= (n/2); i++) {
				if (n % i == 0) {
					System.out.println("Given number " + n + " is Not Prime");
					count = 1;
					break;
				}
			}if (count == 0) {
				System.out.println("Given number is Prime");
			}
		}
		sc.close();
	}

}

