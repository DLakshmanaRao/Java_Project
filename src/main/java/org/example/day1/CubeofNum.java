package org.example.day1;

import java.util.Scanner;

public class CubeofNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int cube = num * num * num;
		System.out.println("Cube of " + num + " is " + cube);
		sc.close();
	}

}
