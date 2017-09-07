package ivan;

import java.util.Scanner; // 100/100

public class _08_Sum_of_Odd_Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Integer n = Integer.parseInt(input.nextLine());
        Integer sum = 0;

        for (int i = 1; i < n * 2; i += 2) {
            System.out.printf("%d\n", i);
            sum += i;
        }
        System.out.printf("Sum: %d", sum);

    }
}
