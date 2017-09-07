package ivan;

import java.util.Scanner;

public class _01_Choose_a_Drink {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String proffesions = input.nextLine();

        if (proffesions.equals("Athlete")){
            System.out.printf("Water\n");
        }
        else if (proffesions.equals("Businessman")||proffesions.equals("Businesswoman")){
            System.out.printf("Coffee\n");
        }
        else if (proffesions.equals("SoftUni Student")){
            System.out.printf("Beer\n");
        }
        else {
            System.out.printf("Tea");
        }
    }
}
