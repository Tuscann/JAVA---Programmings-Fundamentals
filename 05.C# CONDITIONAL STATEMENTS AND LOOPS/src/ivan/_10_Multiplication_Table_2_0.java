package ivan;

import java.util.Scanner;   // 100/100

public class _10_Multiplication_Table_2_0 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Integer n = Integer.parseInt(input.nextLine());
        Integer m = Integer.parseInt(input.nextLine());

        if (n > 10 || m > 10) {
            System.out.printf("%d X %d = %d\n", n, m, n * m);
        }

        for (int i = 1; i <= 10; i++) {
            if (i >= m) {
                System.out.printf("%d X %d = %d\n", n, m, n * m);
                m++;
            }
        }
    }
}
