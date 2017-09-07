package ivan;

import java.util.Scanner;

public class _10_Triangle_of_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer n=Integer.parseInt(input.nextLine());

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
