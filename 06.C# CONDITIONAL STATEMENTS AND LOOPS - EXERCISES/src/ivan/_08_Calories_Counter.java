package ivan;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class _08_Calories_Counter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer counter = Integer.parseInt(input.nextLine());
        LinkedHashMap<String, Integer> SortedDictionary = new LinkedHashMap<String, Integer>();
        SortedDictionary.put("cheese", 500);
        SortedDictionary.put("tomato sauce", 150);
        SortedDictionary.put("salami", 600);
        SortedDictionary.put("pepper", 50);

        Integer sum = 0;

        for (int i = 0; i < counter; i++) {
            String current = input.nextLine().toLowerCase();

            if (SortedDictionary.containsKey(current)){
                sum+=SortedDictionary.get(current);
            }

        }
        System.out.printf("Total calories: %d",sum);
    }
}
