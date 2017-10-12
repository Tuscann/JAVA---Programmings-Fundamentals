import java.util.Scanner;  // 0/100

public class _11_Convert_Speed_Units {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float distanceInMetters = Float.parseFloat(scanner.nextLine());
        float hours = Float.parseFloat(scanner.nextLine());
        float minutes = Float.parseFloat(scanner.nextLine());
        float seconds = Float.parseFloat(scanner.nextLine());

        float totalSec = hours * 3600 + minutes * 60 + seconds;
        float totalH = hours + minutes / 60 + seconds / 3600;

        System.out.println(distanceInMetters / totalSec);
        System.out.println(distanceInMetters / 1000 / totalH);
        System.out.println(distanceInMetters / 1609 / totalH);
    }
}
