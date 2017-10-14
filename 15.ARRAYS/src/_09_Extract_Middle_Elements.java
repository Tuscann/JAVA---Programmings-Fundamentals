import java.util.Scanner;  // 100/100

public class _09_Extract_Middle_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        int[] arrNumbers = new int[arr.length];
        for (int i = 0; i < arrNumbers.length; i++) {
            arrNumbers[i] = Integer.parseInt(arr[i]);
        }

        if (arrNumbers.length == 1) {
            for (int arrNumber : arrNumbers) {
                System.out.println(arrNumber);
            }
        }
        else if ((arrNumbers.length) % 2 == 0) {
            int[] readyForPringArray = EvenArray(arrNumbers);

            for (int aReadyForPringArray : readyForPringArray) {
                System.out.print(aReadyForPringArray + " ");
            }
        }
        else if (arrNumbers.length % 2 != 0) {
            int[] readyForPringArray = OddArray(arrNumbers);

            for (int aReadyForPringArray : readyForPringArray) {
                System.out.print(aReadyForPringArray + " ");
            }
        }
    }


    private static int[] EvenArray(int[] arrNumbers) {
        int[] printArrEven = new int[2];

        for (int i = 0; i <arrNumbers.length ; i++) {
            if (i == arrNumbers.length / 2 - 1) {
                printArrEven[0] = arrNumbers[i];
            } else if (i == arrNumbers.length / 2) {
                printArrEven[1] = arrNumbers[i];
            }
        }
        return printArrEven;
    }

    private static int[] OddArray(int[] arrNumbers) {
        int[] printArrOdd = new int[3];

        for (int i = 0; i <arrNumbers.length ; i++) {
            if (i == arrNumbers.length / 2 - 1) {
                printArrOdd[0] = arrNumbers[i];
            } else if (i == arrNumbers.length / 2) {
                printArrOdd[1] = arrNumbers[i];
            } else if (i == arrNumbers.length / 2 + 1) {
                printArrOdd[2] = arrNumbers[i];
            }
        }
        return printArrOdd;
    }
}
