package ivan;

import java.util.Scanner;

public class _05_Word_in_Plural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String ivan = "";

        if (word.endsWith("y")) {
            ivan = word.substring(0, word.length() - 1);
            ivan += "ies";
        } else if (word.substring(word.length() - 1).equals("o") || word.substring(word.length() - 1).equals("s") || word.substring(word.length() - 1).equals("x") || word.substring(word.length() - 1).equals("z")) {
            ivan = word + "es";
        } else if (word.endsWith("ch") || word.endsWith("sh")) {
            ivan = word + "es";
        } else {
            ivan = word + "s";
        }

        System.out.printf("%s", ivan);


    }
}
