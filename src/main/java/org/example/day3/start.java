package org.example.day3;

public class start {
    public class Pattern {

        public static void main(String[] args) {
            int n = 10;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
