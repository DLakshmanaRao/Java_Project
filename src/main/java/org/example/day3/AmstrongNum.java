package org.example.day3;

import java.util.Scanner;

public class AmstrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter a number : ");
		int n = sc.nextInt();
		int k = n;
		String N = Integer.toString(n);
		int l = N.length();
		int count = 0;
		for (int i=1;i<=l;i++) {
			int x=n%10;
			double pow = Math.pow(x, l);
			count += pow;
			n = n/10;
		}
		System.out.print(count);
		if ( count == k){
			System.out.println(String.format("%s is Armstrong number",n));
		} else if (count != k){
			System.out.println(String.format("%s is NOT Armstrong number",n));
		}
		sc.close();
	}


}
