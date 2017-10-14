import java.util.Scanner;  // 100/100

public class _03_Fold_and_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        int[] inputArray = StringToIntArr(inputArr);

        int[] firstArr = FirstArray(inputArray);
        int[] middleArr = MiddleArray(inputArray);
        int[] lastArr = SecondArray(inputArray);
        int[] combFirstAndSecArray = RotateAndCombinationInArray(firstArr, lastArr);
        int[] middlePlusComboArr = MiddlePlusComboArray(middleArr, combFirstAndSecArray);

        for (int aMiddlePlusComboArr : middlePlusComboArr) {
            System.out.print(aMiddlePlusComboArr + " ");
        }
    }

    private static int[] MiddlePlusComboArray(int[] middleArr, int[] combFirstAndSecArray) {
        int[] resultArr = new int[middleArr.length];

        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = middleArr[i] + combFirstAndSecArray[i];
        }

        return resultArr;
    }

    private static int[] RotateAndCombinationInArray(int[] firstArr, int[] lastArr) {
        int[] combFirstAndSecArray = new int[firstArr.length + lastArr.length];

        int left = 0;
        int right = firstArr.length - 1;
        while(left < right){
            int temp = firstArr[left];
            firstArr[left] = firstArr[right];
            firstArr[right] = temp;
            left++;
            right--;
        }
        int left2 = 0;
        int right2 = lastArr.length - 1;
        while(left2 < right2){
            int temp = lastArr[left2];
            lastArr[left2] = lastArr[right2];
            lastArr[right2] = temp;
            left2++;
            right2--;
        }
        int count=0;
        for(int i=0; i<firstArr.length; i++) {
            combFirstAndSecArray[i]=firstArr[i];
            count++;
        }
        for (int aLastArr : lastArr) {
            combFirstAndSecArray[count++] = aLastArr;
        }


        return combFirstAndSecArray;
    }

    private static int[] MiddleArray(int[] inputArray) {
        int[] middleArr = new int[(inputArray.length + 1) /2];

        System.arraycopy(inputArray, (inputArray.length + 1) / 4, middleArr, 0, middleArr.length);
        return middleArr;
    }

    private static int[] SecondArray(int[] inputArray) {
        int[] secondArr = new int[(inputArray.length + 1) /4];

        System.arraycopy(inputArray, secondArr.length * 3, secondArr, 0, secondArr.length);
        return secondArr;
    }

    private static int[] FirstArray(int[] inputArray) {
        int[] firstArr = new int[(inputArray.length + 1) /4];

        System.arraycopy(inputArray, 0, firstArr, 0, firstArr.length);
        return firstArr;
    }

    private static int[] StringToIntArr(String[] inputArr) {
        int[] inputArray = new int[inputArr.length];

        for (int i = 0; i < inputArray.length ; i++) {
            inputArray[i] = Integer.parseInt(inputArr[i]);
        }
        return inputArray;
    }
}
