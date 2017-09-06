package ivan;

import java.util.Scanner;  // 100/100

public class _01_Passed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double n = Double.parseDouble(input.nextLine());
        if (n >= 3.00) {
            System.out.printf("Passed!");
        }
    }
}
