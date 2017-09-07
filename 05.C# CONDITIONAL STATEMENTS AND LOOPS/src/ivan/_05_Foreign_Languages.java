package ivan;

import java.util.Scanner;   // 100/100

public class _05_Foreign_Languages {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String country = input.nextLine();

        if (country.equals("USA")||country.equals("England")){
            System.out.printf("English");
        }
        else  if (country.equals("Spain")||country.equals("Argentina")||country.equals("Mexico")){
            System.out.printf("Spanish");
        }
        else {
            System.out.printf("unknown");
        }

    }
}
