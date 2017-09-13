package com.company;

import java.util.Scanner;  // 100/100

public class _06_Catch_the_Thief {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        long maxValue = Long.MIN_VALUE;
        long thiefsID = Long.MIN_VALUE;
        switch (type) {
            case "sbyte":
                maxValue = Byte.MAX_VALUE;
                break;
            case "int":
                maxValue = Integer.MAX_VALUE;
                break;
            case "long":
                maxValue = Long.MAX_VALUE;
                break;
        }

        int n = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            long value = Long.valueOf(scanner.nextLine());
            if (value <= maxValue && value > thiefsID) {
                thiefsID = value;
            }
        }
        System.out.println(thiefsID);
    }
}
