package ivan;

import java.util.Scanner;

public class _15_Neighbour_Wars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer damegePesho = Integer.parseInt(input.nextLine());
        Integer damegeGosho = Integer.parseInt(input.nextLine());

        int healthPesho = 100;
        int healthGosho = 100;
        int counter = 1;

        while (true)
        {
            if (counter % 2 == 1)
            {
                healthGosho -= damegePesho;

                if (healthGosho <= 0)
                {
                    System.out.printf("Pesho won in %dth round.\n",counter);

                    break;
                }
                System.out.printf("Pesho used Roundhouse kick and reduced Gosho to %d health.\n",healthGosho);
            }
            else if (counter % 2 == 0)
            {
                healthPesho -= damegeGosho;

                if (healthPesho <= 0)
                {
                    System.out.printf("Gosho won in %dth round.\n",counter);
                    break;
                }
                System.out.printf("Gosho used Thunderous fist and reduced Pesho to %d health.\n",healthPesho);
            }
            if (counter % 3 == 0)
            {
                healthGosho += 10;
                healthPesho += 10;
            }
            counter++;
        }
    }
}
