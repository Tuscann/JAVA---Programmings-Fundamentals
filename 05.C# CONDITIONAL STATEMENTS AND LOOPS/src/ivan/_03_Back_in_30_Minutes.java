package ivan;

import java.util.Scanner;  // 100/100

public class _03_Back_in_30_Minutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer hour = Integer.parseInt(input.nextLine());
        Integer minutes = Integer.parseInt(input.nextLine());

        Integer totaltime = hour * 60 + minutes + 30;
        Integer leftHours = totaltime / 60;
        Integer leftMinutes = totaltime % 60;
        if (leftHours == 24) {
            leftHours = 0;
        }
        if (leftMinutes<=9){
            System.out.printf("%d:0%d", leftHours, leftMinutes);
        }
        else {
            System.out.printf("%d:%d", leftHours, leftMinutes);
        }

    }
}
