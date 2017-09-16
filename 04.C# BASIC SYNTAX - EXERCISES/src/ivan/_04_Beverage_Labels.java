package ivan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _04_Beverage_Labels {   // 100/100
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double volume = Double.parseDouble(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double sugar = Double.parseDouble(scanner.nextLine());
        double totalEnergy = energy * (volume/100);
        double totalSugar = sugar * (volume/100);

        DecimalFormat myFormatter = new DecimalFormat("###.####");


        System.out.printf("%sml %s:%n", myFormatter.format(volume),name);
        System.out.printf("%skcal, %sg sugars",
                myFormatter.format(totalEnergy) , myFormatter.format(totalSugar));
    }
}




