package com.company;

import java.util.Scanner;  // 100/100

public class _11_String_Concatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String delimiter = scanner.nextLine();
        int rowCheck = scanner.nextLine().toLowerCase().equals("even") ? 0 : 1;
        int n = Integer.valueOf(scanner.nextLine());
        StringBuilder message = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            String row = scanner.nextLine();
            if (i % 2 == rowCheck) {
                message.append(row);
                message.append(delimiter);
            }
        }

        System.out.println(message.substring(0, message.length() - 1));
    }
}
