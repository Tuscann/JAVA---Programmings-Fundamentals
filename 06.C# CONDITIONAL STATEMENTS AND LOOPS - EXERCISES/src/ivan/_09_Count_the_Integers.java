package ivan;

import java.util.Scanner;

public class _09_Count_the_Integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer counter = 0;

        while (true) {
            String current = input.nextLine();

            try{
                int num = Integer.parseInt(current);
                counter++;

            } catch (NumberFormatException e) {
                break;
            }

        }
        System.out.printf("%d",counter);
    }
}
