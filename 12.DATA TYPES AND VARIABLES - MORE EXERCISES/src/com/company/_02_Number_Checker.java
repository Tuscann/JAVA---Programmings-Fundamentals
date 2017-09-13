package com.company;

import java.util.Scanner;   // 100/100

public class _02_Number_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            long num = Long.valueOf(scanner.nextLine());
            System.out.println("integer");
        } catch (NumberFormatException nfe) {
            System.out.println("floating-point");
        }
    }
}
