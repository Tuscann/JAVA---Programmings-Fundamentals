import java.util.Scanner; // 100/100

public class _01_Blank_Receipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintReceipt();
    }

    private static void PrintReceipt() {
        PrintTheHeader();
        PrintBody();
        PrintFooter();
    }


    private static void PrintTheHeader() {
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }

    private static void PrintBody() {
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }

    private static void PrintFooter() {
        System.out.println("------------------------------");
        System.out.println("\u00A9 SoftUni");
    }
}
