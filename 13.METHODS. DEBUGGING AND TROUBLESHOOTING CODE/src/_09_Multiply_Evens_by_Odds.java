import java.util.Scanner; // 100/100

public class _09_Multiply_Evens_by_Odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(GetMultipleOfEvenAndOddDigits(n));

    }

    private static int GetMultipleOfEvenAndOddDigits(int n) {
        int sumEven = GetSumOfEvenDigits(n);
        int sumOdd = GetSumOfOddDigits(n);

        return sumEven * sumOdd;
    }

    private static int GetSumOfOddDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;

            if (lastDigit % 2 != 0) {
                sum += lastDigit;
            }
            n /= 10;
        }
        return sum;
    }

    private static int GetSumOfEvenDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;

            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            n /= 10;
        }
        return sum;
    }
}

