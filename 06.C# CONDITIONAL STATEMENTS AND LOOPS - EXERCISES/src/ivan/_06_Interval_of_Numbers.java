package ivan;

import java.util.Scanner;

public class _06_Interval_of_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer start = Integer.parseInt(input.nextLine());
        Integer end = Integer.parseInt(input.nextLine());

        Integer max=Math.max(start,end);
        Integer min=Math.min(start,end);

        for (int i = min; i <=max ; i++) {
            System.out.printf("%d\n",i);
        }
    }
}
