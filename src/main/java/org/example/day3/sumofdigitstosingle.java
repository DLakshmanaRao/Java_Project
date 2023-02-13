package org.example.day3;

import java.util.Scanner;
public class sumofdigitstosingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        String N = Integer.toString(n);
        int L = N.length();
        int count = 0;

        for (int i=1;i<=L;i++) {
            int x=n%10;
            count += x;
            n = n/10;
        }
        System.out.println("count of digits of given number  = "+count);
        sc.close();
        String C = Integer.toString(count);
        int count2 = 0;
        if (C.length() > 1) {
            for (int j=1;j<=C.length();j++) {
                int x1=count%10;
                count2 += x1;
                count = count/10;
            }
        }
        System.out.println("Sum of digits to one digit = "+count2);
    }

}


