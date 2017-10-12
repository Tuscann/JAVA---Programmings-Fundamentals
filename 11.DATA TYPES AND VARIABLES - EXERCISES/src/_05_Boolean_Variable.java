import java.util.Scanner;  // 100/100

public class _05_Boolean_Variable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String readThis = scanner.nextLine();
        Boolean transfer = Boolean.valueOf(readThis);

        if (transfer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
