package ivan;

import java.util.Scanner;  // 100/100

public class _07_Divisible_by_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Integer n = Integer.parseInt(input.nextLine());

        for (int i = 3; i < 100; i += 3) {
            System.out.printf("%d\n",i);
        }
    }
}
