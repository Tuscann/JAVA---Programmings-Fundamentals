import java.util.Scanner; // 25/100

public class _05_Rounding_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        double[] doubleArray = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            doubleArray[i] = Double.parseDouble(arr[i]);
        }

        for (double aDoubleArray : doubleArray) {
            if (aDoubleArray > 0) {
                System.out.println(aDoubleArray + " => " + Math.round(aDoubleArray));
            }
        }
    }
}
