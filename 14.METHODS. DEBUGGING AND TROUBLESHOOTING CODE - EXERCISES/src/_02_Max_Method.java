import java.util.Scanner;

public class _02_Max_Method {                        // 100/100
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer first = Integer.parseInt(scan.nextLine());
        Integer secound = Integer.parseInt(scan.nextLine());
        Integer third = Integer.parseInt(scan.nextLine());

        System.out.println(maxNumber(first, maxNumber(secound,third)));
    }

    private static int maxNumber(Integer first, Integer secound) {
        if (first > secound) {
            return first;
        }
        return secound;
    }
}
