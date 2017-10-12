import java.text.DecimalFormat;   // 80/100
import java.util.Scanner;

public class _07_Math_Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("########################.##");

        double number = Double.parseDouble(scanner.nextLine());
        double pow = Double.parseDouble(scanner.nextLine());

        double result = RaiseToPower(number, pow);
        System.out.println(df.format(result));
    }

    private static double RaiseToPower(double n, double p)
    {
        return Math.pow(n, p);
    }
}
