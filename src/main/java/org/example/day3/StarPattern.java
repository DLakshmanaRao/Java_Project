package org.example.day3;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter a number : ");
		int num = sc.nextInt();
		for (int i=0;i<=num+1;i++) {
			for (int j=1;j<i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}



