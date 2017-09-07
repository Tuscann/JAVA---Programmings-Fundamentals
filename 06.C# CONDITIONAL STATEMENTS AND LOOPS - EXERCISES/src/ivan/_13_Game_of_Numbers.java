package ivan;

import java.util.Scanner;

public class _13_Game_of_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer n = Integer.parseInt(input.nextLine());
        Integer m = Integer.parseInt(input.nextLine());

        Integer magicNumber = Integer.parseInt(input.nextLine());

        int counter = 0;
        boolean found = false;
        int printOne = 0;
        int printTwo = 0;

        for (int i = n; i <= m; i++)
        {
            for (int j = n; j <= m; j++)
            {
                //Console.WriteLine("{0} {1}", i, j);
                counter++;

                if (i + j == magicNumber)
                {
                    found = true;
                    printOne = i;
                    printTwo = j;
                }
            }
        }
        if (found)
        {
            System.out.printf("Number found! %d + %d = %d\n",printOne,printTwo,printOne+printTwo);
        }
        else
        {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
