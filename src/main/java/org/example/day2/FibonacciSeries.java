package org.example.day2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3 = 1;
		
		for (int i=0;i<n;i++) {
			n3 = n1 + n2;
			i = n3 + n2;
			i = n3;
			n1 = n2;
			n2 = n3;
			n3 = i;
			System.out.println(i);
		}
		sc.close();
	}

}

