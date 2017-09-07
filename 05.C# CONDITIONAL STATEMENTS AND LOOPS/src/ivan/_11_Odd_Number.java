package ivan;

import java.util.Scanner; // 100/100

public class _11_Odd_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            Integer current=Integer.parseInt(input.nextLine());

            if (current%2!=0){
                System.out.printf("The number is: %d",Math.abs(current));
                break;
            }
            System.out.printf("Please write an odd number.\n");

        }
    }
}
