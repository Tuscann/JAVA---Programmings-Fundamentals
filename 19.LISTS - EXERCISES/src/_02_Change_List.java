import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;  // 100/100
import java.util.Scanner;

public class _02_Change_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> myList = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        ArrayList<Integer> myIntList = new ArrayList<>();
        for(String s : myList) {
            myIntList.add(Integer.valueOf(s));
        }

        ArrayList<String> command = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        while (!command.get(0).contains("Odd") && !command.get(0).contains("Even")) {

            if (command.get(0).contains("Delete"))
            {
                int element = Integer.parseInt(command.get(1));

                myIntList.removeAll(Collections.singletonList(element));
            }
            else if (command.get(0).contains("Insert"))
            {
                int element = Integer.parseInt(command.get(1));
                int position = Integer.parseInt(command.get(2));

                myIntList.add(position, element);
            }

            command = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        }

        if (command.get(0).contains("Odd")) {
            for (Integer aMyIntList : myIntList) {
                if (aMyIntList % 2 != 0) {
                    System.out.print(aMyIntList + " ");
                }
            }
        } else {
            for (Integer aMyIntList : myIntList) {
                if (aMyIntList % 2 == 0) {
                    System.out.print(aMyIntList + " ");
                }
            }
        }
    }
}
