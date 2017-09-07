package ivan;

import java.util.Scanner;

public class _07_Cake_Ingredients {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer counter = 0;

        while (true) {
            String current = input.nextLine();
            if (current.equals("Bake!")) {
                break;
            }
            System.out.printf("Adding ingredient %s.\n", current);
            counter++;

        }
        if (counter!=0){
            System.out.printf("Preparing cake with %d ingredients.",counter);
        }
    }
}
