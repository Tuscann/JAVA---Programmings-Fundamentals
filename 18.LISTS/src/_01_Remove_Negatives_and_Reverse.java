import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;  // 100/100
import java.util.Scanner;

public class _01_Remove_Negatives_and_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> myList = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        ArrayList<Integer> myIntList = new ArrayList<>();
        ArrayList<Integer> myPositiveIntList = new ArrayList<>();

        for(String s : myList) {
            myIntList.add(Integer.valueOf(s));
        }

        for (Integer aMyIntList : myIntList) {
            if (aMyIntList > 0)
                myPositiveIntList.add(aMyIntList);
        }

        Collections.reverse(myPositiveIntList);

        if (myPositiveIntList.size() > 0) {
            System.out.println(myPositiveIntList);
        } else {
            System.out.println("empty");
        }
    }
}
