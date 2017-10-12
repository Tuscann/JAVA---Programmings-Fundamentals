import java.util.Scanner;

public class _08_Greater_of_Two_Values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        switch (input) {
            case "int": {
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                int outputLarger = GetIntMax(first, second);
                System.out.println(outputLarger);
                break;
            }
            case "char": {
                char first = scanner.nextLine().charAt(0);
                char second = scanner.nextLine().charAt(0);
                char outputLarger = GetCharMax(first, second);
                System.out.println(outputLarger);
                break;
            }
            default: {
                String first = scanner.nextLine();
                String second = scanner.nextLine();
                String outputLarger = GetStringMax(first, second);
                System.out.println(outputLarger);
                break;
            }
        }

    }

    private static int GetIntMax(int first, int second)
    {
        return  Math.max(first, second);
    }

    private static String GetStringMax(String first, String second)
    {
        int result = first.compareTo(second);

        if (result <= 0) {
            return second;
        }  else {
            return first;
        }
    }

    private static char GetCharMax(char first, char second)
    {
        if (first >= second) {
            return first;
        } else {
            return second;
        }
    }
}
