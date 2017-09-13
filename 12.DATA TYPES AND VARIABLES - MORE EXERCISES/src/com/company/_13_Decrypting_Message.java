package com.company;

import java.util.Scanner;

public class _13_Decrypting_Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.valueOf(scanner.nextLine());
        int n = Integer.valueOf(scanner.nextLine());
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char character = scanner.nextLine().charAt(0);
            message.append((char)(character + key));
        }

        System.out.println(message);
    }
}
