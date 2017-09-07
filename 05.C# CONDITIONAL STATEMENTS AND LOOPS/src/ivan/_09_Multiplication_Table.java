package ivan;

import java.util.Scanner; // 100/100

public class _09_Multiplication_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer n = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
}
