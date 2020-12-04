package com.company;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String a = scanner.nextLine();
            if (a.equalsIgnoreCase("0")){
                System.out.println("STOP");
                break;
            }
        }
    }
}
