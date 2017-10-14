import java.util.Scanner; // 100/100

public class _04_Triple_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        int[] intArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            intArray[i] = Integer.parseInt(arr[i]);
        }

        boolean isNo = true;

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                for (int anIntArray : intArray) {
                    if (intArray[i] + intArray[j] == anIntArray) {
                        System.out.print(intArray[i] + " + " + intArray[j] + " == " + anIntArray);
                        System.out.println();
                        isNo = false;
                        break;
                    }
                }
            }
        }
        if (isNo) {
            System.out.println("No");
        }
    }
}
