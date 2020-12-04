package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("8 * 9 = ");

        while (true){
            String a = scanner.nextLine();
            int b = 72;
            if (a.equalsIgnoreCase("72")){
                System.out.println("ВІРНО");
                break;
            }else {
                System.out.println("Відповідь не правильна!");
            }
        }
    }
}
