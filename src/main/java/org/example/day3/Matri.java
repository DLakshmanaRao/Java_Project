package org.example.day3;

import java.util.Scanner;

public class Matri {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter a number : ");
		int num = sc.nextInt();
		for (int i=1;i<=num;i++) {
			for (int j=1;j<num+1;j++) {
				if(i == j) {
					System.out.print("5"+" ");
				} else {
					System.out.print("0"+" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}


