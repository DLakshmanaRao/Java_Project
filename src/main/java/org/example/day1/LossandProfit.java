package org.example.day1;

import java.util.Scanner;

public class LossandProfit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Cost of item : ");
		float CostofItem = sc.nextFloat();
		System.out.println("Enter selling amount : ");
		float SellingPrice = sc.nextFloat();
		float AmountTally = SellingPrice - CostofItem;
		if (AmountTally > 0) {
			System.out.println("seller has made a profit and profit amount = " + AmountTally);
		} else if (AmountTally < 0) {
			System.out.println("Seller incurred a loss and amount loss = " + AmountTally);
		}
		sc.close();
	}

}
