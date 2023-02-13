package org.example.day3;

import java.util.Scanner;

public class Pattern123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter a number : ");
		int num = sc.nextInt();
		int n = 1;
		for (int i=0;i<=num+1;i++) {
			for (int j=1;j<i;j++) {
				System.out.print(n+" ");
				n += 1;
			}
			System.out.println();
		}
		sc.close();
	}

}


