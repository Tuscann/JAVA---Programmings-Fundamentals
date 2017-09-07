package ivan;

import java.util.Scanner;

public class _03_Restaurant_Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer countOfPeople = Integer.parseInt(input.nextLine());
        String servicePackage = input.nextLine();
        String hall = "";
        Integer price1 = 0;
        Integer price2 = 0;
        Double discount = 0.0;

        if (countOfPeople > 120) {
            System.out.printf("We do not have an appropriate hall.");

        } else {
            if (countOfPeople <= 50) {
                hall = "Small Hall";
                price1 = 2500;
            } else if (countOfPeople <= 100) {
                hall = "Terrace";
                price1 = 5000;
            } else if (countOfPeople <= 120) {
                hall = "Great Hall";
                price1 = 7500;
            }

            if (servicePackage.equals("Normal")) {
                discount = 0.05;
                price2 = 500;
            } else if (servicePackage.equals("Gold")) {
                discount = 0.1;
                price2 = 750;
            } else if (servicePackage.equals("Platinum")) {
                discount = 0.15;
                price2 = 1000;
            }
            Double sum = ((price1 + price2) * (1 - discount)) / countOfPeople;

            System.out.printf("We can offer you the %s\n", hall);
            System.out.printf("The price per person is %.2f$", sum);
        }
    }
}
