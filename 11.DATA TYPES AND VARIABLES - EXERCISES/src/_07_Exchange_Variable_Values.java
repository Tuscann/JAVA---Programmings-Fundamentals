import java.util.Scanner;

public class _07_Exchange_Variable_Values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        System.out.printf("Before: %n a = %d %n b = %d %n ", a,b);

        int reminder = a;
        a = b;
        b = reminder;

        System.out.printf("After: %n a = %d %n b = %d %n ", a,b);
    }
}
