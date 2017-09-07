package ivan;

import java.util.Scanner;

public class _11_5_Different_Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Integer first = Integer.parseInt(input.nextLine());
        Integer second = Integer.parseInt(input.nextLine());
        boolean check = true;


        for (int i = first; i <= second; i++) {
            for (int j = first; j <= second; j++) {
                for (int k = first; k <= second; k++) {
                    for (int l = first; l <= second; l++) {
                        for (int m = first; m <= second; m++) {
                            if (i < j && j < k && k < l && l < m) {
                                System.out.printf("%d %d %d %d %d\n", i, j, k, l, m);
                                check = false;
                            }
                        }
                    }
                }
            }
        }
        if (check) {
            System.out.printf("No");
        }
    }
}
