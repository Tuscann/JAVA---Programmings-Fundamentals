package ivan;

import java.util.Scanner;

public class _12_Test_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer number1 = Integer.parseInt(input.nextLine());
        Integer number2 = Integer.parseInt(input.nextLine());
        Integer boundary = Integer.parseInt(input.nextLine());

        int combinations = 0;
        int sum = 0;

        for (int i = number1; i >= 1; i--)
        {
            for (int j = 1; j <= number2; j++)
            {
                sum += 3 * i * j;
                combinations++;
                if (sum >= boundary)
                {
                    System.out.printf("%d combinations\n",combinations);
                    System.out.printf("Sum: %d >= %d\n",sum,boundary);

                    return;
                }
            }
        }
        System.out.printf("%d combinations\n",combinations);
        System.out.printf("Sum: %d",sum);

    }
}
