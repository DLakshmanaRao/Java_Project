package org.example.day2;

import java.util.Scanner;

public class OnebyNth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		float n = sc.nextInt();
		float sum = 0;
		for (float i=1;i<=n;i++) {
			sum += (1/i);
		}
		System.out.println(sum);
		sc.close();
	}

}
