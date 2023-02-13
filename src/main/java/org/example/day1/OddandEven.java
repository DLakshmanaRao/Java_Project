package org.example.day1;

import java.util.Scanner;

public class OddandEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is Even Number");
		} else {
			System.out.println(num + " is Odd Number");
		}
		sc.close();
	}

}


