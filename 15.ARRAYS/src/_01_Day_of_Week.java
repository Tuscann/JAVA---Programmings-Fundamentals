import java.util.Scanner; //100/100

public class _01_Day_of_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());

        String[] arrayDaysOfWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        if (day < 1 || day > 7) {
            System.out.println("Invalid Day!");
        } else {
            System.out.println(arrayDaysOfWeek[day - 1]);
        }
    }
}
