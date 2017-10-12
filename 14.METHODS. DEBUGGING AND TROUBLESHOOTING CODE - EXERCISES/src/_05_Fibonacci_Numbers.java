import java.math.BigInteger;
import java.util.Scanner;      // 100/100

public class _05_Fibonacci_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer searched = Integer.parseInt(scan.nextLine());
        System.out.println(fibonacci2(searched));

    }

    private static BigInteger fibonacci2(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return fibonacci2(n - 2).add(fibonacci2(n - 1));
    }
}
