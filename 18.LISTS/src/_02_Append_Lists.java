import java.util.ArrayList;
import java.util.Collections; // 100/100
import java.util.Scanner;

public class _02_Append_Lists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] myArr = scanner.nextLine().split("\\|");
        ArrayList<String> myList = new ArrayList<>();

        Collections.addAll(myList, myArr);

        Collections.reverse(myList);

        System.out.println(myList);
    }
}
