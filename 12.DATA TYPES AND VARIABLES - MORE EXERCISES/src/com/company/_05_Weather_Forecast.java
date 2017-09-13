package com.company;

import java.util.Scanner;  // 100/100

public class _05_Weather_Forecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            long num = Long.parseLong(scanner.nextLine());

            if (num <= Byte.MAX_VALUE && num >= Byte.MIN_VALUE) {
                System.out.println("Sunny");
            } else if (num <= Integer.MAX_VALUE && num >= Integer.MIN_VALUE) {
                System.out.println("Cloudy");
            } else  {
                System.out.println("Windy");
            }
        } catch (Exception e) {
            System.out.println("Rainy");
        }
    }
}
