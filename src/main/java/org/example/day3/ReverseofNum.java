package org.example.day3;

import java.util.Scanner;

public class ReverseofNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		String N = Integer.toString(n);
		int L = N.length();
		String count = "";
		for (int i=1;i<=L;i++) {
			int x=n%10;
			count += x;
			n = n/10;
		}
		System.out.print(count);
		sc.close();
	}

}
