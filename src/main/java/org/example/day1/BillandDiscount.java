package org.example.day1;

import java.util.Scanner;
public class BillandDiscount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bill Amount :");
		float bill = sc.nextFloat();
		System.out.println("Enter Age of Customer :");
		float age = sc.nextFloat();
		float discount = (bill * 5) / 100;
		if (age <= 50) {
			System.out.println("Bill Amount is " + bill);
		} else {
			bill -= discount;
			System.out.println("Discount is " + discount);
			System.out.println("Bill Amount is " + bill);
		}
		sc.close();
	}

}

