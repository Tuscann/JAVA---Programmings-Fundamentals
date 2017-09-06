package ivan;

import java.util.Scanner;  // 100/100

public class _01_Debit_Card_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer first = Integer.parseInt(input.nextLine());
        Integer secound = Integer.parseInt(input.nextLine());
        Integer third = Integer.parseInt(input.nextLine());
        Integer four = Integer.parseInt(input.nextLine());

        System.out.printf("%04d %04d %04d %04d",first,secound,third,four);

    }
}
