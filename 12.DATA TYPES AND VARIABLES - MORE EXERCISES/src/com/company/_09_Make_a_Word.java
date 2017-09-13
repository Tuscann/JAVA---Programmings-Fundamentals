package com.company;

import java.util.Scanner;  // 100/100

public class _09_Make_a_Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());
        String word = "";
        for (int i = 0; i < n; i++) {
            word += scanner.nextLine();
        }
        System.out.println("The word is: " + word);
    }

}
