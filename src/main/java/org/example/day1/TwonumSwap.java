package org.example.day1;

import java.util.Scanner;
public class TwonumSwap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number ; ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number ; ");
		int num2 = sc.nextInt();
		System.out.println("Numbers before swap " + num1 + " , " + num2);
		int num = num1;
		num1 = num2;
		num2 = num;
		System.out.println("Numbers after swap " + num1 + "," + num2);
		sc.close();
	}

}
