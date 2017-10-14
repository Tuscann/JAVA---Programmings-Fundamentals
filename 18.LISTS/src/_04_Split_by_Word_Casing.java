import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;  // 25/100

public class _04_Split_by_Word_Casing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(scanner.nextLine().split("[\\s\\[\\]\\\\:,.;!()/]+")));
        ArrayList<String> lowerCase = new ArrayList<>();
        ArrayList<String> upperCase = new ArrayList<>();
        ArrayList<String> mixedCase = new ArrayList<>();

        for (String aMyList : myList) {
            int countLowerCase = 0;
            int countUpperCase = 0;

            for (int j = 0; j < aMyList.length(); j++) {
                if (Character.isUpperCase(aMyList.charAt(j))) {
                    countUpperCase++;
                } else {
                    countLowerCase++;
                }
            }

            boolean isNumber = true;
            try {
                Integer.parseInt(aMyList);
            } catch (NumberFormatException e) {
                isNumber = false;
            }

            if (isNumber) {
                mixedCase.add(aMyList);
            } else if (countLowerCase > 0 && countUpperCase > 0) {
                mixedCase.add(aMyList);
            } else if (countLowerCase == 0 && countUpperCase > 0) {
                upperCase.add(aMyList);
            } else {
                lowerCase.add(aMyList);
            }
        }

        System.out.print("Lower-case: " + String.join(", ", lowerCase));
        System.out.println();
        System.out.print("Mixed-case: " + String.join(", ", mixedCase));
        System.out.println();
        System.out.print("Upper-case: " + String.join(", ", upperCase));
    }
}
