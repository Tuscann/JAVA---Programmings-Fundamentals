import java.util.Scanner;  // 100/100

public class _04_Variable_in_Hex_Format {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hex = scanner.nextLine();
        int outPrint = Integer.parseInt(hex.substring(2), 16);

        System.out.println(outPrint);
    }
}
