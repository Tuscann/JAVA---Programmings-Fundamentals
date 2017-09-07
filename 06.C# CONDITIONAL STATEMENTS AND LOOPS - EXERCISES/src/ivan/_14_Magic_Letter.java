package ivan;

import java.util.Scanner;

public class _14_Magic_Letter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char firstLetter = input.nextLine().charAt(0);
        char lasttLetter = input.nextLine().charAt(0);
        char removeLetter = input.nextLine().charAt(0);

        for (char i = firstLetter; i <= lasttLetter; i++) {
            for (char j = firstLetter; j <= lasttLetter; j++) {
                for (char k = firstLetter; k <= lasttLetter; k++) {

                    if (i != removeLetter && j != removeLetter && k != removeLetter) {
                        System.out.printf("%s%s%s ", i, j, k);
                    }
                }
            }
        }
    }
}
