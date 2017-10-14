import java.util.Arrays;
import java.util.Scanner;

public class _06_Max_Sequence_of_Equal_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        int[] intArray = Arrays.stream(inputArr).mapToInt(Integer::parseInt).toArray();

        int maxStart = 0;
        int maxLen = 1;
        int currentStart = 0;
        int currentLen = 1;

        for (int i = 1; i < intArray.length; i++)
        {
            if (intArray[i] == intArray[currentStart])
            {
                currentLen++;
                if (currentLen > maxLen)
                {
                    maxLen = currentLen;
                    maxStart = currentStart;
                }
            }
            else
            {
                currentLen = 1;
                currentStart = i;
            }
        }

        for (int i = maxStart; i < maxStart + maxLen; i++)
            System.out.print(intArray[i] + " ");
    }
}