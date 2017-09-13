package com.company;

import java.util.Scanner; // 100/100

public class _10_Sum_of_Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            String letter = scanner.nextLine();
            sum += letter.charAt(0);
        }
        System.out.println("The sum equals: " + sum);
    }
}
