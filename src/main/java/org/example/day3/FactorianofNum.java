package org.example.day3;

import java.util.Scanner;

public class FactorianofNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter a number : ");
		int n = sc.nextInt();
		int Fact = 1 ;
		for (int i=n;i>=1;i--) {
			Fact *= i;
		}
		System.out.println("Factorialm of given number "+n+" = "+Fact);
		sc.close();
	}

}
