import java.math.BigInteger;
import java.util.Scanner;  // 100/100

public class _06_Prime_Checker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger number = new BigInteger(scan.nextLine());
        isPrime(number);
    }

    private static void isPrime(BigInteger number) {

        if (!number.isProbablePrime(5)) {
            System.out.println("False");
            return;
        }

        BigInteger two = new BigInteger("2");
        if (!two.equals(number) && BigInteger.ZERO.equals(number.mod(two))) {
            System.out.println("False");
            return;
        }

        for (BigInteger i = new BigInteger("3"); i.multiply(i).compareTo(number) < 1; i = i.add(two)) {
            if (BigInteger.ZERO.equals(number.mod(i))) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }

}
