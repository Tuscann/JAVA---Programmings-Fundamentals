package com.company;

import java.util.Scanner;  // 100/100

public class _12_Beer_Kegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());
        String biggestKeg = "";
        double biggestVolume = 0.0;

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double radius = Double.valueOf(scanner.nextLine());
            double height = Double.valueOf(scanner.nextLine());
            double tempVolume = Math.PI * Math.pow(radius, 2)  * height;
            if (tempVolume > biggestVolume) {
                biggestKeg = name;
                biggestVolume = tempVolume;
            }
        }

        System.out.println(biggestKeg);
    }
}
