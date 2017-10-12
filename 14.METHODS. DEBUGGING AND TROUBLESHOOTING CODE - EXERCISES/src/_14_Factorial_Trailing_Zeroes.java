import java.math.BigInteger; // 100/100
import java.util.Scanner;

public class _14_Factorial_Trailing_Zeroes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = new BigInteger(scanner.nextLine());

        System.out.println(CalculateFactorialTrailingZeroes(n));
    }

    private static int CalculateFactorialTrailingZeroes(BigInteger n) {
        BigInteger sum = CalculateFactorial(n);
        String nToString = sum.toString();
        int counter = 0;

        for (int i = nToString.length() - 1; i >= 0; i--)
        {
            int digit = Character.digit(nToString.charAt(i), 10);
            if (digit != 0) {
                break;
            }
            else {
                counter++;
            }
        }

        return counter;
    }

    private static BigInteger CalculateFactorial(BigInteger n) {
        BigInteger sum = BigInteger.valueOf(1);
        String nToString = n.toString();
        int step = Integer.parseInt(nToString);


        for (int i = step; i > 1 ; i--)
        {
            sum = sum.multiply(n);
            n = n.subtract(BigInteger.valueOf(1));
        }

        return sum;
    }
}
