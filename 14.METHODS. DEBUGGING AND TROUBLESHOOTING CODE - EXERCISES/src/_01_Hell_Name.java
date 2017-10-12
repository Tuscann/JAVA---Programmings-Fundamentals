import java.util.Scanner;

public class _01_Hell_Name {                    // 100/100
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        PrintName(name);
    }

    private static void PrintName(String name) {
        System.out.printf("Hello, %s!", name);
    }
}
