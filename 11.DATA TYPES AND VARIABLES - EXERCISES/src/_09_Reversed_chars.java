import java.util.Scanner;  // 100/100

public class _09_Reversed_chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter1 = scanner.nextLine().charAt(0);
        char letter2 = scanner.nextLine().charAt(0);
        char letter3 = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c", letter3, letter2, letter1);
    }
}
