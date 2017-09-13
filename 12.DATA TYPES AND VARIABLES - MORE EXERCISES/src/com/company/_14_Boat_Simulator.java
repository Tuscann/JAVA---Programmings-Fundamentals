package com.company;

import java.util.Scanner; // 100/100

public class _14_Boat_Simulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstBoat = scanner.nextLine().charAt(0);
        char secondBoat = scanner.nextLine().charAt(0);

        int n = Integer.valueOf(scanner.nextLine());

        int firstBoatMoves = 0;
        int secondBoatMoves = 0;

        boolean isWinner = false;

        for (int i = 1; i <= n; i++) {
            String path = scanner.nextLine();
            if (path.equals("UPGRADE")) {
                firstBoat = (char) (firstBoat + 3);
                secondBoat = (char) (secondBoat + 3);
            } else if (i % 2 == 1) {
                firstBoatMoves += path.length();
            } else {
                secondBoatMoves += path.length();
            }

            if (secondBoatMoves >= 50) {
                System.out.println(secondBoat);
                isWinner = true;
                break;
            } else if (firstBoatMoves >= 50) {
                isWinner = true;
                System.out.println(firstBoat);
                break;
            }
        }

        if (!isWinner) {
            if (secondBoatMoves > firstBoatMoves) {
                System.out.println(secondBoat);
            } else {
                System.out.println(firstBoat);
            }
        }
    }
}
