package org.example.day2;

import java.util.Scanner;

public class OnebyIcube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		float n = sc.nextInt();
		float sum = 0;
		for (float i=1;i<=n;i++) {
			sum += (1/(i*i*i));
		}
		System.out.println(sum);
		sc.close();
	}

}
