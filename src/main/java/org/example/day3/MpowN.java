package org.example.day3;

import java.util.Scanner;

public class MpowN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter a number n : ");
		int n = sc.nextInt();

		System.out.printf("Enter a number m : ");
		int m = sc.nextInt();
		int multi = 1;
		
		for (int i=1;i<=m;i++) {
			multi = multi * n;
			
			
		}
		System.out.println(multi);
		sc.close();
	}

}

