import java.util.Arrays;
import java.util.Scanner;  //80/100

public class _05_Compare_Char_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] inputArr = scanner.nextLine().replaceAll(" ", "").toCharArray();
        char[] inputArr2 = scanner.nextLine().replaceAll(" ", "").toCharArray();

        boolean retval = Arrays.equals(inputArr, inputArr2);

        if (retval) {
            if (CompareLetters(inputArr, inputArr2)) {
                for (char anInputArr2 : inputArr2) {
                    System.out.print(anInputArr2);
                }
                System.out.println();
                for (char anInputArr : inputArr) {
                    System.out.print(anInputArr);
                }
            } else {
                for (char anInputArr : inputArr) {
                    System.out.print(anInputArr);
                }
                System.out.println();
                for (char anInputArr2 : inputArr2) {
                    System.out.print(anInputArr2);
                }
            }
        } else if (inputArr.length > inputArr2.length) {
            for (char anInputArr2 : inputArr2) {
                System.out.print(anInputArr2);
            }
            System.out.println();
            for (char anInputArr : inputArr) {
                System.out.print(anInputArr);
            }
        } else {
            for (char anInputArr : inputArr) {
                System.out.print(anInputArr);
            }
            System.out.println();
            for (char anInputArr2 : inputArr2) {
                System.out.print(anInputArr2);
            }
        }
    }

    private static boolean CompareLetters(char[] inputArr, char[] inputArr2) {

        boolean isFirst = false;

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] <= inputArr2[i]) {
                isFirst = true;
                break;
            }
        }
        return isFirst;
    }
}
