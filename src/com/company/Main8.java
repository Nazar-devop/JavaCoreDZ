package com.company;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        System.out.println("Enter the num of rows: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        int nums = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.format("%-5d", nums++);
            }
            System.out.println();
        }
    }
}
