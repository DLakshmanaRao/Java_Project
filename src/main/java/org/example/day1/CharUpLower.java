package org.example.day1;

import java.util.Scanner;

public class CharUpLower {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Cost of item : ");
		char charector = sc.next().charAt(0);
		int asciiValue = charector;
		if (asciiValue < 65) {
			System.out.println("entered charector " + charector + " a special symbol");
		} else if (asciiValue >= 65 & asciiValue <= 90) {
			System.out.println("entered charector " + charector + " a upper case");
		} else if (asciiValue > 90) {
			System.out.println("entered charector " + charector + " a lower case");
		}
		sc.close();
	}

}
