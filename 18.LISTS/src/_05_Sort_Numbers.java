import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;  // 80/100

public class _05_Sort_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> myList = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        myList.sort(String::compareTo);

        System.out.println(String.join(" <= ", myList));
    }
}
