import java.util.Scanner;

public class _03_English_Name_of_Last_Digit {     // 100/100
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String lastChar = input.substring(input.length() - 1);

        String[] area = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < area.length; i++) {
            if (Integer.parseInt(lastChar) == i) {
                System.out.println(area[i]);
            }
        }
    }
}
