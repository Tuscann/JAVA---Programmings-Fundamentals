package ivan;

import java.math.BigDecimal;
import java.util.Scanner;

public class _04_Beverage_Labels {   // 90/100
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String label = input.nextLine();
        Integer volume = Integer.parseInt(input.nextLine());
        Integer energyContent = Integer.parseInt(input.nextLine());
        Integer sugar = Integer.parseInt(input.nextLine());

        Double energyPerContent = (double) energyContent * volume / 100;
        Double sugar_needed = (double) sugar * volume / 100;

        String x = energyPerContent.toString();

        System.out.printf("%dml %s:\n", volume, label);
        if (x.contains(".")) {
            BigDecimal stripedVal = new BigDecimal(x).stripTrailingZeros();
            System.out.printf("%skcal, %sg sugars", stripedVal, sugar_needed.toString());
        } else {
            System.out.printf("%skcal, %sg sugars", energyPerContent, sugar_needed.toString());
        }
    }
}




