import java.util.Scanner;  // 100/100

public class _15_Substring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'p') { // проверка дали сегашната буква е търсената
                System.out.println(text.substring(i, Math.min(text.length(), number + i + 1))); // взима или number или останалото до края на текста, в зависимост кое е по-кратко
                i = i + Math.min(text.length() - i - 1, number); // прескача брояча то края на взетото от по-горе
                found = true; // за да направим проверката по-надолу и да напишем "no" ако няма сходства
            }
        }
        if (!found) {
            System.out.println("no");
        }
    }
}