package ivan;

import java.util.Scanner;

public class _02_Choose_a_Drink_2_0 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String proffesions = input.nextLine();
        Integer quantity = Integer.parseInt(input.nextLine());
        Double price = 0.0;


        if (proffesions.equals("Athlete")) {
            price = 0.7;

        } else if (proffesions.equals("Businessman") || proffesions.equals("Businesswoman")) {
            price = 1.0;
        } else if (proffesions.equals("SoftUni Student")) {
            price = 1.7;
        } else {
            price = 1.2;
        }
        System.out.printf("The %s has to pay %.2f.\n", proffesions, price*quantity);
    }
}
