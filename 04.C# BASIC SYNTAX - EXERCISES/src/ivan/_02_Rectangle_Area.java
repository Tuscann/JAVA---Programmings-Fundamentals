package ivan;

import java.util.Scanner;  // 100/100

public class _02_Rectangle_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double width = Double.parseDouble(input.nextLine());
        Double height = Double.parseDouble(input.nextLine());


        System.out.printf("%.2f",width*height);
    }
}
