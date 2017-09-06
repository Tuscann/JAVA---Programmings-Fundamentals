package ivan;

import java.util.Scanner;

public class _01_Greeting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.printf("Hello, %s!",name);
    }
}
