package org.example.day2;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		String N = Integer.toString(n);
		int L = N.length();
		int count = 0;
		for (int i=1;i<=L;i++) {
			int x=n%10;
			count += x;
			n = n/10;
		}
		System.out.print(count);
		sc.close();
	}

}
