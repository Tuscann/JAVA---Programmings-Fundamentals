import java.util.Scanner; // 100/100

public class _06_Reverse_Array_of_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringArray = scanner.nextLine().split(" ");

        for (int i = stringArray.length - 1; i >= 0  ; i--) {
            System.out.print(stringArray[i] + " ");
        }
    }
}
