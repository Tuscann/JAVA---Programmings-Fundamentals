import java.util.Arrays;
import java.util.Scanner;  // 100/100

public class _08_Most_Frequent_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] intArray = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        System.out.println(FindMostFrequentNumber(intArray));
    }

    private static int FindMostFrequentNumber(int[] intArray) {
        int counter = 0;
        int number = 0;

        for (int anIntArray : intArray) {
            int br = 0;

            for (int anIntArray1 : intArray) {
                if (anIntArray == anIntArray1) {
                    br++;
                }
            }
            if (br > counter) {
                number = anIntArray;
                counter = br;
            }
        }
        return number;
    }
}
