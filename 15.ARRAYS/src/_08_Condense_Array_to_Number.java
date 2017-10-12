import java.util.Scanner; // 100/100

public class _08_Condense_Array_to_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        int[] arrayNumbers = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            arrayNumbers[i] = Integer.parseInt(arr[i]);
        }

        while (arrayNumbers.length > 1) {

            int[] condenset = new int[arrayNumbers.length - 1];
            for (int i = 0; i < condenset.length ; i++) {
                condenset[i] = arrayNumbers[i] + arrayNumbers[i + 1];
            }
            arrayNumbers = condenset;
        }

        System.out.println(arrayNumbers[0]);
    }
}
