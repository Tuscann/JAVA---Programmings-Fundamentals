import java.text.DecimalFormat;
import java.util.Scanner;  // 80/100

public class _03_Megapixels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#####################0.0");

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0fx%.0f => ", width, height);
        System.out.print(df.format(CalculateMegapixels(width, height)) + "MP");
    }

    private static double CalculateMegapixels(double w, double h) {
        return (w * h) / 1000000;

    }
}
