import java.util.Scanner;  // 100/100

public class _02_Circle_Area_Precision_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());

        double circleArea = Math.PI * radius * radius;

        System.out.printf("%.12f", circleArea);
    }
}
