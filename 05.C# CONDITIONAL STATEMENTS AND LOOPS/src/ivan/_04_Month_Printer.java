package ivan;

import java.util.Scanner;  // 100/100

public class _04_Month_Printer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer month = Integer.parseInt(input.nextLine());

        String[] myIntArray = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if (month >= 1 && month <= 12) {
            System.out.printf(myIntArray[month - 1]);
        } else {
            System.out.printf("Error!");
        }

    }
}
