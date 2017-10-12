import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Integer n = Integer.parseInt(scan.nextLine());
        String x = scan.nextLine();
        String[] textAsList=x.split("\\s+");


        Predicate<String> checkerUpperCase = s -> s.charAt(0) == s.toUpperCase().charAt(0);

        ArrayList<String> result = new ArrayList<>();
        for (String word : textAsList) {
            if (checkerUpperCase.test(word)) {
                result.add(word);
            }
        }
        System.out.printf("%d\n",result.size());
        for (String aResult : result) {
            System.out.printf("%s\n", aResult);
        }


    }

    private static void print(Integer s) {
        System.out.printf("%d", s);
    }

    private static Integer ivana(Integer n) {
        return n + 34;
    }


}
