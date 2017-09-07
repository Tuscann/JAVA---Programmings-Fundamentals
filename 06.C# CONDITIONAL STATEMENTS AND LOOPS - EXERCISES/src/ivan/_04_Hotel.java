package ivan;

import java.util.Scanner;

public class _04_Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String month = input.nextLine();
        Double nights = Double.parseDouble(input.nextLine());

        Double discount = 1.0;

        if (month.equals("May")) {
            if (nights > 7) {
                discount = 0.95;
            }
            System.out.printf("Studio: %.2f lv.\n", nights * 50 * discount);
            System.out.printf("Double: %.2f lv.\n", nights * 65);
            System.out.printf("Suite: %.2f lv.\n", nights * 75);
        } else if (month.equals("October")) {
            if (nights > 7) {
                discount = 0.95;
                System.out.printf("Studio: %.2f lv.\n", (nights - 1) * 50 * discount);
            } else {
                System.out.printf("Studio: %.2f lv.\n", nights * 50);
            }
            System.out.printf("Double: %.2f lv.\n", nights * 65);
            System.out.printf("Suite: %.2f lv.\n", nights * 75);
        } else if (month.equals("June")) {
            System.out.printf("Studio: %.2f lv.\n", nights * 60);
            if (nights > 14) {
                System.out.printf("Double: %.2f lv.\n", nights * 72 * 0.9);

            } else {
                System.out.printf("Double: %.2f lv.\n", nights * 72);
            }
            System.out.printf("Suite: %.2f lv.\n", nights * 82);
        } else if (month.equals("September")) {

            if (nights > 14) {
                System.out.printf("Studio: %.2f lv.\n", (nights - 1) * 60);
                discount = 0.90;

            } else if (nights > 7 && nights <= 14) {
                System.out.printf("Studio: %.2f lv.\n", (nights - 1) * 60);
            } else {
                System.out.printf("Studio: %.2f lv.\n", nights * 60);
            }
            System.out.printf("Double: %.2f lv.\n", nights * 72 * discount);
            System.out.printf("Suite: %.2f lv.\n", nights * 82);
        } else {
            System.out.printf("Studio: %.2f lv.\n", nights * 68);
            System.out.printf("Double: %.2f lv.\n", nights * 77 * discount);
            if (nights > 14) {
                discount = 0.85;
            }
            System.out.printf("Suite: %.2f lv.\n", nights * 89 * discount);
        }
    }
}
