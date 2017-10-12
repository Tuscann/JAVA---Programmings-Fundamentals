import java.util.Scanner; // 100/100

public class _04_Numbers_in_Reversed_Order {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stringInput = scan.nextLine();
        StringBuilder stringche = new StringBuilder(stringInput);

        System.out.println(stringche.reverse());
    }
}
