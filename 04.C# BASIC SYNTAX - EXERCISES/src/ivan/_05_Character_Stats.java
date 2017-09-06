package ivan;

import java.util.Scanner;  // 100/100

public class _05_Character_Stats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int healthTotal1 = Integer.parseInt(input.nextLine());
        int end = Integer.parseInt(input.nextLine());
        int healthTotal2 = Integer.parseInt(input.nextLine());
        int end2 = Integer.parseInt(input.nextLine());

        System.out.printf("Name: %s\n",name);
        System.out.printf("Health: |%s%s|\n",repeatStr("|",healthTotal1),repeatStr(".",end-healthTotal1));
        System.out.printf("Energy: |%s%s|",repeatStr("|",healthTotal2),repeatStr(".",end2-healthTotal2));

    }
    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
