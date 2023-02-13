package org.example.day1;

import java.util.Scanner;
public class ConvertPositive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num >= 0) {
			System.out.println(num);
		} else {
			num = num * (-1);
			System.out.println(num);
		}
		sc.close();
	}

}
