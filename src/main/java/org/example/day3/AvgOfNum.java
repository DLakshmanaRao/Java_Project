package org.example.day3;

import java.util.ArrayList;


import java.util.Scanner;
public class AvgOfNum {

    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1;i<= N;i++){
            myNumbers.add(sc.nextInt());
        }

        float sum = 0;
        int count = 0;
        float Avg = 0;
        for (int num:myNumbers) {
            System.out.print( num + " ");
            sum = sum+num;
            count += 1;
            Avg = sum/count;


        }
        System.out.println("\n"+sum);
        System.out.println(count);
        System.out.println(Avg);
        sc.close();
    }
}
