package org.example.day1;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Capital amount P :");
		float P = sc.nextFloat();
		System.out.println("Enter the value of Time T :");
		float T = sc.nextFloat();
		System.out.println("Enter the value of rate R :");
		float R = sc.nextFloat();
		float I = (P * T * R) / 100;
		System.out.println("intrest is " + I);
		sc.close();
	}
}
