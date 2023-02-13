package org.example.day1;

import java.util.Scanner;

public class SumAndAvg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int A = sc.nextInt();
		System.out.println("Enter 2nd number");
		int B = sc.nextInt();
		int C = A + B;
		float Avg = (A + B) / 2.0f;

		System.out.println("Sum of A + B = " + C);
		System.out.println("Average of A + B = " + Avg);
		sc.close();
	}

}
