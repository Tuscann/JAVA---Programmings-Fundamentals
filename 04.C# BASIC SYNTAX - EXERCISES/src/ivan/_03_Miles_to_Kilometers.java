package ivan;

import java.util.Scanner;  // 100/100

public class _03_Miles_to_Kilometers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double n = Double.parseDouble(input.nextLine());

        System.out.printf("%.2f", n * 1.60934);
    }
}
