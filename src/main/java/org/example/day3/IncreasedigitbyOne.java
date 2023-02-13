package org.example.day3;

import java.util.Scanner;

public class IncreasedigitbyOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter a number : ");
		int n = sc.nextInt();
		String N = Integer.toString(n);
		int n1 = N.length();
		String J = "";
		for (int i=1;i<=n1;i++) {
			int x=n%10;
		
			if (x == 9) {
				J = (0)+J;
			}else {
				J=(x+1) + J;
			}
			
			n=n/10;
		}
		System.out.println(J);
			
		
		sc.close();
	}

}
