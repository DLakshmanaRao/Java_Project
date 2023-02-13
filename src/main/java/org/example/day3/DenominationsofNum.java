package org.example.day3;

import java.util.Scanner;

public class DenominationsofNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter a 4 digit number : ");
		int n = sc.nextInt();
		String N = Integer.toString(n);
		int m = N.length();
		for (int i = 1; i <= m; i++) {
			if (m == 4) {
				int x1 = n % 10;
			System.out.println("1 * " + x1 + " = " + x1);
				n = n / 10;

				int x10 = n % 10;
				String y10= Integer.toString(x10);
			System.out.println(String.format("10 * %s = %s0",x10,y10));
				n = n / 10;

				int x100 = n % 10;
				String y100= Integer.toString(x100);
			System.out.println(String.format("100 * %s = %s00",x100,y100));
				n = n / 10;

				int x1000 = n;
				String y1000= Integer.toString(x1000);
			System.out.println(String.format("1000 * %s = %s000",x1000,y1000));
				break;
			}
		}
		sc.close();
	}

}
