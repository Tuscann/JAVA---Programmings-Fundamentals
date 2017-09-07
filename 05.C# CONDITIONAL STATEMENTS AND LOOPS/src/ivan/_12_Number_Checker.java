package ivan;

import java.util.Scanner; // 100/100

public class _12_Number_Checker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String check = input.nextLine();

        boolean isNumeric = check.chars().allMatch( Character::isDigit );

        if (isNumeric){
            System.out.printf("It is a number.");
        }
        else {
            System.out.printf("Invalid input!");
        }

    }
}
