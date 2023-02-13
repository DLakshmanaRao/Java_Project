package org.example.day2;

import java.util.Scanner;

public class SunNaturalnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		for  (int i=0;i<=n;i++) {
			sum += i;
			System.out.println(i+" ");
		}
		System.out.println("sum of numbers = "+sum);
		sc.close();
	}

}

