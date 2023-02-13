package org.example.day1;

import java.util.Scanner;

public class NetAvgweight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight of 1st person : ");
		float W1 = sc.nextFloat();
		System.out.println("Enter weight of 2nd person : ");
		float W2 = sc.nextFloat();
		System.out.println("Enter weight of 3rd person : ");
		float W3 = sc.nextFloat();
		System.out.println("Enter weight of 4th person : ");
		float W4 = sc.nextFloat();
		System.out.println("Enter weight of 5th person : ");
		float W5 = sc.nextFloat();
		float Avg = (W1 + W2 + W3 + W4 + W5) / 5;
		float Net = (W1 + W2 + W3 + W4 + W5);
		System.out.println("Average of weights of persons = " + Avg);
		System.out.println("Net of weights of persons = " + Net);
		sc.close();
	}
}

