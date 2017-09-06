package ivan;

import java.util.Scanner;

public class _02_Add_Two_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer a = Integer.parseInt(input.nextLine());
        Integer b = Integer.parseInt(input.nextLine());


        System.out.printf("%d + %d = %d",a,b,a+b);
    }
}
