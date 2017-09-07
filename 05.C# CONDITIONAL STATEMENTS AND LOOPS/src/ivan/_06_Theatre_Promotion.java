package ivan;

import java.util.Scanner;  // 100/100

public class _06_Theatre_Promotion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String dayOfWeek = input.nextLine();
        Integer age = Integer.parseInt(input.nextLine());
        Integer money = 0;

        if (age >= 0 && age <= 18) {
            if (dayOfWeek.equals("Weekday")) {
                money = 12;
            } else if (dayOfWeek.equals("Weekend")) {
                money = 15;
            } else if (dayOfWeek.equals("Holiday")) {
                money = 5;
            }
            System.out.printf("%d$",money);

        } else if (age > 18 && age <= 64) {
            if (dayOfWeek.equals("Weekday")) {
                money = 18;
            } else if (dayOfWeek.equals("Weekend")) {
                money = 20;
            } else if (dayOfWeek.equals("Holiday")) {
                money = 12;
            }
            System.out.printf("%d$",money);

        } else if (age > 64 && age <= 122) {
            if (dayOfWeek.equals("Weekday")) {
                money = 12;
            } else if (dayOfWeek.equals("Weekend")) {
                money = 15;
            } else if (dayOfWeek.equals("Holiday")) {
                money = 10;
            }
            System.out.printf("%d$",money);

        } else {
            System.out.printf("Error!");
        }
    }
}
