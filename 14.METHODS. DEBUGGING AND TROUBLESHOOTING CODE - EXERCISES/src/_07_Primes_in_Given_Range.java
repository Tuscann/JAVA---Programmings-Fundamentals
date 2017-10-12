import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;  // 100/100

public class _07_Primes_in_Given_Range {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer startNumber = new Integer(scan.nextLine());
        Integer endNumber = new Integer(scan.nextLine());
        List<Integer> list = new ArrayList<>();

        for (Integer i = Math.max(startNumber, 2); i <= endNumber; i++) {
            if (isPrime(i)) {

                list.add(i);
            }
        }
        System.out.println(list.toString().substring(1, list.toString().length() - 1));
    }

    private static boolean isPrime(Integer n) {

        int k = 2;
        while (k * k <= n) {
            if (n % k == 0) {
                return false;
            }
            k++;
        }
        return true;
    }
}